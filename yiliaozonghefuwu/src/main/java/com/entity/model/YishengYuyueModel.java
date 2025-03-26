package com.entity.model;

import com.entity.YishengYuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 医生预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YishengYuyueModel implements Serializable {
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
     * 医生预约编号
     */
    private String yishengYuyueUuidNumber;


    /**
     * 预约标题
     */
    private String yishengYuyueName;


    /**
     * 预约类型
     */
    private Integer yishengYuyueTypes;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yishengYuyueTime;


    /**
     * 预约内容
     */
    private String yishengYuyueContent;


    /**
     * 预约状态
     */
    private Integer yishengYuyueYesnoTypes;


    /**
     * 预约回复
     */
    private String yishengYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yishengYuyueShenheTime;


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
	 * 获取：医生预约编号
	 */
    public String getYishengYuyueUuidNumber() {
        return yishengYuyueUuidNumber;
    }


    /**
	 * 设置：医生预约编号
	 */
    public void setYishengYuyueUuidNumber(String yishengYuyueUuidNumber) {
        this.yishengYuyueUuidNumber = yishengYuyueUuidNumber;
    }
    /**
	 * 获取：预约标题
	 */
    public String getYishengYuyueName() {
        return yishengYuyueName;
    }


    /**
	 * 设置：预约标题
	 */
    public void setYishengYuyueName(String yishengYuyueName) {
        this.yishengYuyueName = yishengYuyueName;
    }
    /**
	 * 获取：预约类型
	 */
    public Integer getYishengYuyueTypes() {
        return yishengYuyueTypes;
    }


    /**
	 * 设置：预约类型
	 */
    public void setYishengYuyueTypes(Integer yishengYuyueTypes) {
        this.yishengYuyueTypes = yishengYuyueTypes;
    }
    /**
	 * 获取：预约时间
	 */
    public Date getYishengYuyueTime() {
        return yishengYuyueTime;
    }


    /**
	 * 设置：预约时间
	 */
    public void setYishengYuyueTime(Date yishengYuyueTime) {
        this.yishengYuyueTime = yishengYuyueTime;
    }
    /**
	 * 获取：预约内容
	 */
    public String getYishengYuyueContent() {
        return yishengYuyueContent;
    }


    /**
	 * 设置：预约内容
	 */
    public void setYishengYuyueContent(String yishengYuyueContent) {
        this.yishengYuyueContent = yishengYuyueContent;
    }
    /**
	 * 获取：预约状态
	 */
    public Integer getYishengYuyueYesnoTypes() {
        return yishengYuyueYesnoTypes;
    }


    /**
	 * 设置：预约状态
	 */
    public void setYishengYuyueYesnoTypes(Integer yishengYuyueYesnoTypes) {
        this.yishengYuyueYesnoTypes = yishengYuyueYesnoTypes;
    }
    /**
	 * 获取：预约回复
	 */
    public String getYishengYuyueYesnoText() {
        return yishengYuyueYesnoText;
    }


    /**
	 * 设置：预约回复
	 */
    public void setYishengYuyueYesnoText(String yishengYuyueYesnoText) {
        this.yishengYuyueYesnoText = yishengYuyueYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getYishengYuyueShenheTime() {
        return yishengYuyueShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setYishengYuyueShenheTime(Date yishengYuyueShenheTime) {
        this.yishengYuyueShenheTime = yishengYuyueShenheTime;
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
