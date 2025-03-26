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
 * 药物信息
 *
 * @author 
 * @email
 */
@TableName("yaopin")
public class YaopinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YaopinEntity() {

	}

	public YaopinEntity(T t) {
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
     * 药物编号
     */
    @TableField(value = "yaopin_uuid_number")

    private String yaopinUuidNumber;


    /**
     * 药物名称
     */
    @TableField(value = "yaopin_name")

    private String yaopinName;


    /**
     * 药物类型
     */
    @TableField(value = "yaopin_types")

    private Integer yaopinTypes;


    /**
     * 产品规格
     */
    @TableField(value = "yaopin_guige")

    private String yaopinGuige;


    /**
     * 药物库存数量
     */
    @TableField(value = "yaopin_kucun_number")

    private Integer yaopinKucunNumber;


    /**
     * 生产厂商
     */
    @TableField(value = "shengchanchangshang")

    private String shengchanchangshang;


    /**
     * 药物剂型
     */
    @TableField(value = "jixing_types")

    private Integer jixingTypes;


    /**
     * 用法用量
     */
    @TableField(value = "yongfayongliang")

    private String yongfayongliang;


    /**
     * 功效主治
     */
    @TableField(value = "gongxiao_content")

    private String gongxiaoContent;


    /**
     * 不良反应
     */
    @TableField(value = "buliang_content")

    private String buliangContent;


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
	 * 设置：药物编号
	 */
    public String getYaopinUuidNumber() {
        return yaopinUuidNumber;
    }
    /**
	 * 获取：药物编号
	 */

    public void setYaopinUuidNumber(String yaopinUuidNumber) {
        this.yaopinUuidNumber = yaopinUuidNumber;
    }
    /**
	 * 设置：药物名称
	 */
    public String getYaopinName() {
        return yaopinName;
    }
    /**
	 * 获取：药物名称
	 */

    public void setYaopinName(String yaopinName) {
        this.yaopinName = yaopinName;
    }
    /**
	 * 设置：药物类型
	 */
    public Integer getYaopinTypes() {
        return yaopinTypes;
    }
    /**
	 * 获取：药物类型
	 */

    public void setYaopinTypes(Integer yaopinTypes) {
        this.yaopinTypes = yaopinTypes;
    }
    /**
	 * 设置：产品规格
	 */
    public String getYaopinGuige() {
        return yaopinGuige;
    }
    /**
	 * 获取：产品规格
	 */

    public void setYaopinGuige(String yaopinGuige) {
        this.yaopinGuige = yaopinGuige;
    }
    /**
	 * 设置：药物库存数量
	 */
    public Integer getYaopinKucunNumber() {
        return yaopinKucunNumber;
    }
    /**
	 * 获取：药物库存数量
	 */

    public void setYaopinKucunNumber(Integer yaopinKucunNumber) {
        this.yaopinKucunNumber = yaopinKucunNumber;
    }
    /**
	 * 设置：生产厂商
	 */
    public String getShengchanchangshang() {
        return shengchanchangshang;
    }
    /**
	 * 获取：生产厂商
	 */

    public void setShengchanchangshang(String shengchanchangshang) {
        this.shengchanchangshang = shengchanchangshang;
    }
    /**
	 * 设置：药物剂型
	 */
    public Integer getJixingTypes() {
        return jixingTypes;
    }
    /**
	 * 获取：药物剂型
	 */

    public void setJixingTypes(Integer jixingTypes) {
        this.jixingTypes = jixingTypes;
    }
    /**
	 * 设置：用法用量
	 */
    public String getYongfayongliang() {
        return yongfayongliang;
    }
    /**
	 * 获取：用法用量
	 */

    public void setYongfayongliang(String yongfayongliang) {
        this.yongfayongliang = yongfayongliang;
    }
    /**
	 * 设置：功效主治
	 */
    public String getGongxiaoContent() {
        return gongxiaoContent;
    }
    /**
	 * 获取：功效主治
	 */

    public void setGongxiaoContent(String gongxiaoContent) {
        this.gongxiaoContent = gongxiaoContent;
    }
    /**
	 * 设置：不良反应
	 */
    public String getBuliangContent() {
        return buliangContent;
    }
    /**
	 * 获取：不良反应
	 */

    public void setBuliangContent(String buliangContent) {
        this.buliangContent = buliangContent;
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
        return "Yaopin{" +
            "id=" + id +
            ", yaopinUuidNumber=" + yaopinUuidNumber +
            ", yaopinName=" + yaopinName +
            ", yaopinTypes=" + yaopinTypes +
            ", yaopinGuige=" + yaopinGuige +
            ", yaopinKucunNumber=" + yaopinKucunNumber +
            ", shengchanchangshang=" + shengchanchangshang +
            ", jixingTypes=" + jixingTypes +
            ", yongfayongliang=" + yongfayongliang +
            ", gongxiaoContent=" + gongxiaoContent +
            ", buliangContent=" + buliangContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
