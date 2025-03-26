
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 居民健康信息
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/jiankang")
public class JiankangController {
    private static final Logger logger = LoggerFactory.getLogger(JiankangController.class);

    @Autowired
    private JiankangService jiankangService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private YonghuService yonghuService;

    @Autowired
    private YishengService yishengService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("医生".equals(role))
            params.put("yishengId",request.getSession().getAttribute("userId"));
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = jiankangService.queryPage(params);

        //字典表数据转换
        List<JiankangView> list =(List<JiankangView>)page.getList();
        for(JiankangView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JiankangEntity jiankang = jiankangService.selectById(id);
        if(jiankang !=null){
            //entity转view
            JiankangView view = new JiankangView();
            BeanUtils.copyProperties( jiankang , view );//把实体数据重构到view中

                //级联表
                YonghuEntity yonghu = yonghuService.selectById(jiankang.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody JiankangEntity jiankang, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jiankang:{}",this.getClass().getName(),jiankang.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            jiankang.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<JiankangEntity> queryWrapper = new EntityWrapper<JiankangEntity>()
            .eq("yonghu_id", jiankang.getYonghuId())
            .eq("celiang_time", new SimpleDateFormat("yyyy-MM-dd").format(jiankang.getCeliangTime()))
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiankangEntity jiankangEntity = jiankangService.selectOne(queryWrapper);
        if(jiankangEntity==null){
            jiankang.setInsertTime(new Date());
            jiankang.setCreateTime(new Date());
            jiankangService.insert(jiankang);
            return R.ok();
        }else {
            return R.error(511,"该居民该天已有测量结果");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JiankangEntity jiankang, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,jiankang:{}",this.getClass().getName(),jiankang.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            jiankang.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<JiankangEntity> queryWrapper = new EntityWrapper<JiankangEntity>()
            .notIn("id",jiankang.getId())
            .andNew()
            .eq("yonghu_id", jiankang.getYonghuId())
            .eq("celiang_time", new SimpleDateFormat("yyyy-MM-dd").format(jiankang.getCeliangTime()))
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiankangEntity jiankangEntity = jiankangService.selectOne(queryWrapper);
        if(jiankangEntity==null){
            jiankangService.updateById(jiankang);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"该居民该天已有测量结果");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        jiankangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<JiankangEntity> jiankangList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            JiankangEntity jiankangEntity = new JiankangEntity();
//                            jiankangEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            jiankangEntity.setXintiao(data.get(0));                    //心跳 要改的
//                            jiankangEntity.setXueya(data.get(0));                    //血压 要改的
//                            jiankangEntity.setXueyang(data.get(0));                    //血氧 要改的
//                            jiankangEntity.setMaibo(data.get(0));                    //脉搏 要改的
//                            jiankangEntity.setCeliangTime(sdf.parse(data.get(0)));          //测量日期 要改的
//                            jiankangEntity.setJiankangContent("");//详情和图片
//                            jiankangEntity.setInsertTime(date);//时间
//                            jiankangEntity.setCreateTime(date);//时间
                            jiankangList.add(jiankangEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        jiankangService.insertBatch(jiankangList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
