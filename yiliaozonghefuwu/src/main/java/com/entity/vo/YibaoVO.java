package com.entity.vo;

import com.entity.YibaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 居民医保信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yibao")
public class YibaoVO implements Serializable {
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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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

}
