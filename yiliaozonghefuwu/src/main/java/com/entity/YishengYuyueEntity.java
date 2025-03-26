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
 * 医生预约
 *
 * @author 
 * @email
 */
@TableName("yisheng_yuyue")
public class YishengYuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YishengYuyueEntity() {

	}

	public YishengYuyueEntity(T t) {
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
     * 医生
     */
    @TableField(value = "yisheng_id")

    private Integer yishengId;


    /**
     * 医生预约编号
     */
    @TableField(value = "yisheng_yuyue_uuid_number")

    private String yishengYuyueUuidNumber;


    /**
     * 预约标题
     */
    @TableField(value = "yisheng_yuyue_name")

    private String yishengYuyueName;


    /**
     * 预约类型
     */
    @TableField(value = "yisheng_yuyue_types")

    private Integer yishengYuyueTypes;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "yisheng_yuyue_time")

    private Date yishengYuyueTime;


    /**
     * 预约内容
     */
    @TableField(value = "yisheng_yuyue_content")

    private String yishengYuyueContent;


    /**
     * 预约状态
     */
    @TableField(value = "yisheng_yuyue_yesno_types")

    private Integer yishengYuyueYesnoTypes;


    /**
     * 预约回复
     */
    @TableField(value = "yisheng_yuyue_yesno_text")

    private String yishengYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "yisheng_yuyue_shenhe_time")

    private Date yishengYuyueShenheTime;


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
	 * 设置：医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }
    /**
	 * 获取：医生
	 */

    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 设置：医生预约编号
	 */
    public String getYishengYuyueUuidNumber() {
        return yishengYuyueUuidNumber;
    }
    /**
	 * 获取：医生预约编号
	 */

    public void setYishengYuyueUuidNumber(String yishengYuyueUuidNumber) {
        this.yishengYuyueUuidNumber = yishengYuyueUuidNumber;
    }
    /**
	 * 设置：预约标题
	 */
    public String getYishengYuyueName() {
        return yishengYuyueName;
    }
    /**
	 * 获取：预约标题
	 */

    public void setYishengYuyueName(String yishengYuyueName) {
        this.yishengYuyueName = yishengYuyueName;
    }
    /**
	 * 设置：预约类型
	 */
    public Integer getYishengYuyueTypes() {
        return yishengYuyueTypes;
    }
    /**
	 * 获取：预约类型
	 */

    public void setYishengYuyueTypes(Integer yishengYuyueTypes) {
        this.yishengYuyueTypes = yishengYuyueTypes;
    }
    /**
	 * 设置：预约时间
	 */
    public Date getYishengYuyueTime() {
        return yishengYuyueTime;
    }
    /**
	 * 获取：预约时间
	 */

    public void setYishengYuyueTime(Date yishengYuyueTime) {
        this.yishengYuyueTime = yishengYuyueTime;
    }
    /**
	 * 设置：预约内容
	 */
    public String getYishengYuyueContent() {
        return yishengYuyueContent;
    }
    /**
	 * 获取：预约内容
	 */

    public void setYishengYuyueContent(String yishengYuyueContent) {
        this.yishengYuyueContent = yishengYuyueContent;
    }
    /**
	 * 设置：预约状态
	 */
    public Integer getYishengYuyueYesnoTypes() {
        return yishengYuyueYesnoTypes;
    }
    /**
	 * 获取：预约状态
	 */

    public void setYishengYuyueYesnoTypes(Integer yishengYuyueYesnoTypes) {
        this.yishengYuyueYesnoTypes = yishengYuyueYesnoTypes;
    }
    /**
	 * 设置：预约回复
	 */
    public String getYishengYuyueYesnoText() {
        return yishengYuyueYesnoText;
    }
    /**
	 * 获取：预约回复
	 */

    public void setYishengYuyueYesnoText(String yishengYuyueYesnoText) {
        this.yishengYuyueYesnoText = yishengYuyueYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getYishengYuyueShenheTime() {
        return yishengYuyueShenheTime;
    }
    /**
	 * 获取：审核时间
	 */

    public void setYishengYuyueShenheTime(Date yishengYuyueShenheTime) {
        this.yishengYuyueShenheTime = yishengYuyueShenheTime;
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
        return "YishengYuyue{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", yishengId=" + yishengId +
            ", yishengYuyueUuidNumber=" + yishengYuyueUuidNumber +
            ", yishengYuyueName=" + yishengYuyueName +
            ", yishengYuyueTypes=" + yishengYuyueTypes +
            ", yishengYuyueTime=" + yishengYuyueTime +
            ", yishengYuyueContent=" + yishengYuyueContent +
            ", yishengYuyueYesnoTypes=" + yishengYuyueYesnoTypes +
            ", yishengYuyueYesnoText=" + yishengYuyueYesnoText +
            ", yishengYuyueShenheTime=" + yishengYuyueShenheTime +
            ", createTime=" + createTime +
        "}";
    }
}
