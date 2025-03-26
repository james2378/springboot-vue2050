package com.entity.model;

import com.entity.YaopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 药物信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YaopinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 药物编号
     */
    private String yaopinUuidNumber;


    /**
     * 药物名称
     */
    private String yaopinName;


    /**
     * 药物类型
     */
    private Integer yaopinTypes;


    /**
     * 产品规格
     */
    private String yaopinGuige;


    /**
     * 药物库存数量
     */
    private Integer yaopinKucunNumber;


    /**
     * 生产厂商
     */
    private String shengchanchangshang;


    /**
     * 药物剂型
     */
    private Integer jixingTypes;


    /**
     * 用法用量
     */
    private String yongfayongliang;


    /**
     * 功效主治
     */
    private String gongxiaoContent;


    /**
     * 不良反应
     */
    private String buliangContent;


    /**
     * 录入时间
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
	 * 获取：药物编号
	 */
    public String getYaopinUuidNumber() {
        return yaopinUuidNumber;
    }


    /**
	 * 设置：药物编号
	 */
    public void setYaopinUuidNumber(String yaopinUuidNumber) {
        this.yaopinUuidNumber = yaopinUuidNumber;
    }
    /**
	 * 获取：药物名称
	 */
    public String getYaopinName() {
        return yaopinName;
    }


    /**
	 * 设置：药物名称
	 */
    public void setYaopinName(String yaopinName) {
        this.yaopinName = yaopinName;
    }
    /**
	 * 获取：药物类型
	 */
    public Integer getYaopinTypes() {
        return yaopinTypes;
    }


    /**
	 * 设置：药物类型
	 */
    public void setYaopinTypes(Integer yaopinTypes) {
        this.yaopinTypes = yaopinTypes;
    }
    /**
	 * 获取：产品规格
	 */
    public String getYaopinGuige() {
        return yaopinGuige;
    }


    /**
	 * 设置：产品规格
	 */
    public void setYaopinGuige(String yaopinGuige) {
        this.yaopinGuige = yaopinGuige;
    }
    /**
	 * 获取：药物库存数量
	 */
    public Integer getYaopinKucunNumber() {
        return yaopinKucunNumber;
    }


    /**
	 * 设置：药物库存数量
	 */
    public void setYaopinKucunNumber(Integer yaopinKucunNumber) {
        this.yaopinKucunNumber = yaopinKucunNumber;
    }
    /**
	 * 获取：生产厂商
	 */
    public String getShengchanchangshang() {
        return shengchanchangshang;
    }


    /**
	 * 设置：生产厂商
	 */
    public void setShengchanchangshang(String shengchanchangshang) {
        this.shengchanchangshang = shengchanchangshang;
    }
    /**
	 * 获取：药物剂型
	 */
    public Integer getJixingTypes() {
        return jixingTypes;
    }


    /**
	 * 设置：药物剂型
	 */
    public void setJixingTypes(Integer jixingTypes) {
        this.jixingTypes = jixingTypes;
    }
    /**
	 * 获取：用法用量
	 */
    public String getYongfayongliang() {
        return yongfayongliang;
    }


    /**
	 * 设置：用法用量
	 */
    public void setYongfayongliang(String yongfayongliang) {
        this.yongfayongliang = yongfayongliang;
    }
    /**
	 * 获取：功效主治
	 */
    public String getGongxiaoContent() {
        return gongxiaoContent;
    }


    /**
	 * 设置：功效主治
	 */
    public void setGongxiaoContent(String gongxiaoContent) {
        this.gongxiaoContent = gongxiaoContent;
    }
    /**
	 * 获取：不良反应
	 */
    public String getBuliangContent() {
        return buliangContent;
    }


    /**
	 * 设置：不良反应
	 */
    public void setBuliangContent(String buliangContent) {
        this.buliangContent = buliangContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
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
