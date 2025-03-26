package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 居民健康信息
 *
 * @author 
 * @email
 */
@TableName("jiankang")
public class JiankangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiankangEntity() {

	}

	public JiankangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Jiankang{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", xintiao=" + xintiao +
            ", xueya=" + xueya +
            ", xueyang=" + xueyang +
            ", maibo=" + maibo +
            ", celiangTime=" + celiangTime +
            ", jiankangContent=" + jiankangContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
