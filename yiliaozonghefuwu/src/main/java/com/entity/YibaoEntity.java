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
 * 居民医保信息
 *
 * @author 
 * @email
 */
@TableName("yibao")
public class YibaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YibaoEntity() {

	}

	public YibaoEntity(T t) {
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
     * 医保编号
     */
    @TableField(value = "yibao_uuid_number")

    private String yibaoUuidNumber;


    /**
     * 医保类型
     */
    @TableField(value = "yibao_types")

    private Integer yibaoTypes;


    /**
     * 医保到期日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "yibao_time")

    private Date yibaoTime;


    /**
     * 医保备注
     */
    @TableField(value = "yibao_content")

    private String yibaoContent;


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
	 * 设置：医保编号
	 */
    public String getYibaoUuidNumber() {
        return yibaoUuidNumber;
    }
    /**
	 * 获取：医保编号
	 */

    public void setYibaoUuidNumber(String yibaoUuidNumber) {
        this.yibaoUuidNumber = yibaoUuidNumber;
    }
    /**
	 * 设置：医保类型
	 */
    public Integer getYibaoTypes() {
        return yibaoTypes;
    }
    /**
	 * 获取：医保类型
	 */

    public void setYibaoTypes(Integer yibaoTypes) {
        this.yibaoTypes = yibaoTypes;
    }
    /**
	 * 设置：医保到期日期
	 */
    public Date getYibaoTime() {
        return yibaoTime;
    }
    /**
	 * 获取：医保到期日期
	 */

    public void setYibaoTime(Date yibaoTime) {
        this.yibaoTime = yibaoTime;
    }
    /**
	 * 设置：医保备注
	 */
    public String getYibaoContent() {
        return yibaoContent;
    }
    /**
	 * 获取：医保备注
	 */

    public void setYibaoContent(String yibaoContent) {
        this.yibaoContent = yibaoContent;
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
        return "Yibao{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", yibaoUuidNumber=" + yibaoUuidNumber +
            ", yibaoTypes=" + yibaoTypes +
            ", yibaoTime=" + yibaoTime +
            ", yibaoContent=" + yibaoContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
