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
 * 居民就诊
 *
 * @author 
 * @email
 */
@TableName("jiuzhen")
public class JiuzhenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiuzhenEntity() {

	}

	public JiuzhenEntity(T t) {
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
     * 居民就诊编号
     */
    @TableField(value = "jiuzhen_uuid_number")

    private String jiuzhenUuidNumber;


    /**
     * 主诉
     */
    @TableField(value = "zhusu_content")

    private String zhusuContent;


    /**
     * 现病史
     */
    @TableField(value = "xianbingshi_content")

    private String xianbingshiContent;


    /**
     * 体格检查
     */
    @TableField(value = "tigejiancha_content")

    private String tigejianchaContent;


    /**
     * 诊断结果
     */
    @TableField(value = "zhenduanjieguo_content")

    private String zhenduanjieguoContent;


    /**
     * 处理意见
     */
    @TableField(value = "chuliyijian_content")

    private String chuliyijianContent;


    /**
     * 就诊时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "jiuzhen_time")

    private Date jiuzhenTime;


    /**
     * 记录时间
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
	 * 设置：居民就诊编号
	 */
    public String getJiuzhenUuidNumber() {
        return jiuzhenUuidNumber;
    }
    /**
	 * 获取：居民就诊编号
	 */

    public void setJiuzhenUuidNumber(String jiuzhenUuidNumber) {
        this.jiuzhenUuidNumber = jiuzhenUuidNumber;
    }
    /**
	 * 设置：主诉
	 */
    public String getZhusuContent() {
        return zhusuContent;
    }
    /**
	 * 获取：主诉
	 */

    public void setZhusuContent(String zhusuContent) {
        this.zhusuContent = zhusuContent;
    }
    /**
	 * 设置：现病史
	 */
    public String getXianbingshiContent() {
        return xianbingshiContent;
    }
    /**
	 * 获取：现病史
	 */

    public void setXianbingshiContent(String xianbingshiContent) {
        this.xianbingshiContent = xianbingshiContent;
    }
    /**
	 * 设置：体格检查
	 */
    public String getTigejianchaContent() {
        return tigejianchaContent;
    }
    /**
	 * 获取：体格检查
	 */

    public void setTigejianchaContent(String tigejianchaContent) {
        this.tigejianchaContent = tigejianchaContent;
    }
    /**
	 * 设置：诊断结果
	 */
    public String getZhenduanjieguoContent() {
        return zhenduanjieguoContent;
    }
    /**
	 * 获取：诊断结果
	 */

    public void setZhenduanjieguoContent(String zhenduanjieguoContent) {
        this.zhenduanjieguoContent = zhenduanjieguoContent;
    }
    /**
	 * 设置：处理意见
	 */
    public String getChuliyijianContent() {
        return chuliyijianContent;
    }
    /**
	 * 获取：处理意见
	 */

    public void setChuliyijianContent(String chuliyijianContent) {
        this.chuliyijianContent = chuliyijianContent;
    }
    /**
	 * 设置：就诊时间
	 */
    public Date getJiuzhenTime() {
        return jiuzhenTime;
    }
    /**
	 * 获取：就诊时间
	 */

    public void setJiuzhenTime(Date jiuzhenTime) {
        this.jiuzhenTime = jiuzhenTime;
    }
    /**
	 * 设置：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：记录时间
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
        return "Jiuzhen{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", yishengId=" + yishengId +
            ", jiuzhenUuidNumber=" + jiuzhenUuidNumber +
            ", zhusuContent=" + zhusuContent +
            ", xianbingshiContent=" + xianbingshiContent +
            ", tigejianchaContent=" + tigejianchaContent +
            ", zhenduanjieguoContent=" + zhenduanjieguoContent +
            ", chuliyijianContent=" + chuliyijianContent +
            ", jiuzhenTime=" + jiuzhenTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
