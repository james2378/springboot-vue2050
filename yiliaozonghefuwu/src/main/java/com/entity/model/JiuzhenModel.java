package com.entity.model;

import com.entity.JiuzhenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 居民就诊
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiuzhenModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 医生
     */
    private Integer yishengId;


    /**
     * 居民就诊编号
     */
    private String jiuzhenUuidNumber;


    /**
     * 主诉
     */
    private String zhusuContent;


    /**
     * 现病史
     */
    private String xianbingshiContent;


    /**
     * 体格检查
     */
    private String tigejianchaContent;


    /**
     * 诊断结果
     */
    private String zhenduanjieguoContent;


    /**
     * 处理意见
     */
    private String chuliyijianContent;


    /**
     * 就诊时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiuzhenTime;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }


    /**
	 * 设置：医生
	 */
    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 获取：居民就诊编号
	 */
    public String getJiuzhenUuidNumber() {
        return jiuzhenUuidNumber;
    }


    /**
	 * 设置：居民就诊编号
	 */
    public void setJiuzhenUuidNumber(String jiuzhenUuidNumber) {
        this.jiuzhenUuidNumber = jiuzhenUuidNumber;
    }
    /**
	 * 获取：主诉
	 */
    public String getZhusuContent() {
        return zhusuContent;
    }


    /**
	 * 设置：主诉
	 */
    public void setZhusuContent(String zhusuContent) {
        this.zhusuContent = zhusuContent;
    }
    /**
	 * 获取：现病史
	 */
    public String getXianbingshiContent() {
        return xianbingshiContent;
    }


    /**
	 * 设置：现病史
	 */
    public void setXianbingshiContent(String xianbingshiContent) {
        this.xianbingshiContent = xianbingshiContent;
    }
    /**
	 * 获取：体格检查
	 */
    public String getTigejianchaContent() {
        return tigejianchaContent;
    }


    /**
	 * 设置：体格检查
	 */
    public void setTigejianchaContent(String tigejianchaContent) {
        this.tigejianchaContent = tigejianchaContent;
    }
    /**
	 * 获取：诊断结果
	 */
    public String getZhenduanjieguoContent() {
        return zhenduanjieguoContent;
    }


    /**
	 * 设置：诊断结果
	 */
    public void setZhenduanjieguoContent(String zhenduanjieguoContent) {
        this.zhenduanjieguoContent = zhenduanjieguoContent;
    }
    /**
	 * 获取：处理意见
	 */
    public String getChuliyijianContent() {
        return chuliyijianContent;
    }


    /**
	 * 设置：处理意见
	 */
    public void setChuliyijianContent(String chuliyijianContent) {
        this.chuliyijianContent = chuliyijianContent;
    }
    /**
	 * 获取：就诊时间
	 */
    public Date getJiuzhenTime() {
        return jiuzhenTime;
    }


    /**
	 * 设置：就诊时间
	 */
    public void setJiuzhenTime(Date jiuzhenTime) {
        this.jiuzhenTime = jiuzhenTime;
    }
    /**
	 * 获取：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：记录时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
