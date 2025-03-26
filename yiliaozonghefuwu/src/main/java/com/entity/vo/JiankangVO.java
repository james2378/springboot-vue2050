package com.entity.vo;

import com.entity.JiankangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 居民健康信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiankang")
public class JiankangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 心跳
     */

    @TableField(value = "xintiao")
    private Double xintiao;


    /**
     * 血压
     */

    @TableField(value = "xueya")
    private Double xueya;


    /**
     * 血氧
     */

    @TableField(value = "xueyang")
    private Double xueyang;


    /**
     * 脉搏
     */

    @TableField(value = "maibo")
    private Double maibo;


    /**
     * 测量日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "celiang_time")
    private Date celiangTime;


    /**
     * 备注
     */

    @TableField(value = "jiankang_content")
    private String jiankangContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：心跳
	 */
    public Double getXintiao() {
        return xintiao;
    }


    /**
	 * 获取：心跳
	 */

    public void setXintiao(Double xintiao) {
        this.xintiao = xintiao;
    }
    /**
	 * 设置：血压
	 */
    public Double getXueya() {
        return xueya;
    }


    /**
	 * 获取：血压
	 */

    public void setXueya(Double xueya) {
        this.xueya = xueya;
    }
    /**
	 * 设置：血氧
	 */
    public Double getXueyang() {
        return xueyang;
    }


    /**
	 * 获取：血氧
	 */

    public void setXueyang(Double xueyang) {
        this.xueyang = xueyang;
    }
    /**
	 * 设置：脉搏
	 */
    public Double getMaibo() {
        return maibo;
    }


    /**
	 * 获取：脉搏
	 */

    public void setMaibo(Double maibo) {
        this.maibo = maibo;
    }
    /**
	 * 设置：测量日期
	 */
    public Date getCeliangTime() {
        return celiangTime;
    }


    /**
	 * 获取：测量日期
	 */

    public void setCeliangTime(Date celiangTime) {
        this.celiangTime = celiangTime;
    }
    /**
	 * 设置：备注
	 */
    public String getJiankangContent() {
        return jiankangContent;
    }


    /**
	 * 获取：备注
	 */

    public void setJiankangContent(String jiankangContent) {
        this.jiankangContent = jiankangContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
