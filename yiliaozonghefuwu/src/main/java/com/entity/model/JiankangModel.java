package com.entity.model;

import com.entity.JiankangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 居民健康信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiankangModel implements Serializable {
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
     * 心跳
     */
    private Double xintiao;


    /**
     * 血压
     */
    private Double xueya;


    /**
     * 血氧
     */
    private Double xueyang;


    /**
     * 脉搏
     */
    private Double maibo;


    /**
     * 测量日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date celiangTime;


    /**
     * 备注
     */
    private String jiankangContent;


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
	 * 获取：心跳
	 */
    public Double getXintiao() {
        return xintiao;
    }


    /**
	 * 设置：心跳
	 */
    public void setXintiao(Double xintiao) {
        this.xintiao = xintiao;
    }
    /**
	 * 获取：血压
	 */
    public Double getXueya() {
        return xueya;
    }


    /**
	 * 设置：血压
	 */
    public void setXueya(Double xueya) {
        this.xueya = xueya;
    }
    /**
	 * 获取：血氧
	 */
    public Double getXueyang() {
        return xueyang;
    }


    /**
	 * 设置：血氧
	 */
    public void setXueyang(Double xueyang) {
        this.xueyang = xueyang;
    }
    /**
	 * 获取：脉搏
	 */
    public Double getMaibo() {
        return maibo;
    }


    /**
	 * 设置：脉搏
	 */
    public void setMaibo(Double maibo) {
        this.maibo = maibo;
    }
    /**
	 * 获取：测量日期
	 */
    public Date getCeliangTime() {
        return celiangTime;
    }


    /**
	 * 设置：测量日期
	 */
    public void setCeliangTime(Date celiangTime) {
        this.celiangTime = celiangTime;
    }
    /**
	 * 获取：备注
	 */
    public String getJiankangContent() {
        return jiankangContent;
    }


    /**
	 * 设置：备注
	 */
    public void setJiankangContent(String jiankangContent) {
        this.jiankangContent = jiankangContent;
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
