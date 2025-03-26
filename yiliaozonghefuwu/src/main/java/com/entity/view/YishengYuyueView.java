package com.entity.view;

import com.entity.YishengYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 医生预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yisheng_yuyue")
public class YishengYuyueView extends YishengYuyueEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 预约类型的值
		*/
		private String yishengYuyueValue;
		/**
		* 预约状态的值
		*/
		private String yishengYuyueYesnoValue;



		//级联表 yisheng
			/**
			* 医生编号
			*/
			private String yishengUuidNumber;
			/**
			* 医生姓名
			*/
			private String yishengName;
			/**
			* 医生手机号
			*/
			private String yishengPhone;
			/**
			* 医生身份证号
			*/
			private String yishengIdNumber;
			/**
			* 医生头像
			*/
			private String yishengPhoto;
			/**
			* 电子邮箱
			*/
			private String yishengEmail;
			/**
			* 科室
			*/
			private Integer keshiTypes;
				/**
				* 科室的值
				*/
				private String keshiValue;
			/**
			* 职位
			*/
			private Integer zhiweiTypes;
				/**
				* 职位的值
				*/
				private String zhiweiValue;

		//级联表 yonghu
			/**
			* 用户编号
			*/
			private String yonghuUuidNumber;
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 现住址
			*/
			private String yonghuAddress;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public YishengYuyueView() {

	}

	public YishengYuyueView(YishengYuyueEntity yishengYuyueEntity) {
		try {
			BeanUtils.copyProperties(this, yishengYuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 预约类型的值
			*/
			public String getYishengYuyueValue() {
				return yishengYuyueValue;
			}
			/**
			* 设置： 预约类型的值
			*/
			public void setYishengYuyueValue(String yishengYuyueValue) {
				this.yishengYuyueValue = yishengYuyueValue;
			}
			/**
			* 获取： 预约状态的值
			*/
			public String getYishengYuyueYesnoValue() {
				return yishengYuyueYesnoValue;
			}
			/**
			* 设置： 预约状态的值
			*/
			public void setYishengYuyueYesnoValue(String yishengYuyueYesnoValue) {
				this.yishengYuyueYesnoValue = yishengYuyueYesnoValue;
			}




















				//级联表的get和set yisheng

					/**
					* 获取： 医生编号
					*/
					public String getYishengUuidNumber() {
						return yishengUuidNumber;
					}
					/**
					* 设置： 医生编号
					*/
					public void setYishengUuidNumber(String yishengUuidNumber) {
						this.yishengUuidNumber = yishengUuidNumber;
					}

					/**
					* 获取： 医生姓名
					*/
					public String getYishengName() {
						return yishengName;
					}
					/**
					* 设置： 医生姓名
					*/
					public void setYishengName(String yishengName) {
						this.yishengName = yishengName;
					}

					/**
					* 获取： 医生手机号
					*/
					public String getYishengPhone() {
						return yishengPhone;
					}
					/**
					* 设置： 医生手机号
					*/
					public void setYishengPhone(String yishengPhone) {
						this.yishengPhone = yishengPhone;
					}

					/**
					* 获取： 医生身份证号
					*/
					public String getYishengIdNumber() {
						return yishengIdNumber;
					}
					/**
					* 设置： 医生身份证号
					*/
					public void setYishengIdNumber(String yishengIdNumber) {
						this.yishengIdNumber = yishengIdNumber;
					}

					/**
					* 获取： 医生头像
					*/
					public String getYishengPhoto() {
						return yishengPhoto;
					}
					/**
					* 设置： 医生头像
					*/
					public void setYishengPhoto(String yishengPhoto) {
						this.yishengPhoto = yishengPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYishengEmail() {
						return yishengEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYishengEmail(String yishengEmail) {
						this.yishengEmail = yishengEmail;
					}

					/**
					* 获取： 科室
					*/
					public Integer getKeshiTypes() {
						return keshiTypes;
					}
					/**
					* 设置： 科室
					*/
					public void setKeshiTypes(Integer keshiTypes) {
						this.keshiTypes = keshiTypes;
					}


						/**
						* 获取： 科室的值
						*/
						public String getKeshiValue() {
							return keshiValue;
						}
						/**
						* 设置： 科室的值
						*/
						public void setKeshiValue(String keshiValue) {
							this.keshiValue = keshiValue;
						}

					/**
					* 获取： 职位
					*/
					public Integer getZhiweiTypes() {
						return zhiweiTypes;
					}
					/**
					* 设置： 职位
					*/
					public void setZhiweiTypes(Integer zhiweiTypes) {
						this.zhiweiTypes = zhiweiTypes;
					}


						/**
						* 获取： 职位的值
						*/
						public String getZhiweiValue() {
							return zhiweiValue;
						}
						/**
						* 设置： 职位的值
						*/
						public void setZhiweiValue(String zhiweiValue) {
							this.zhiweiValue = zhiweiValue;
						}





				//级联表的get和set yonghu

					/**
					* 获取： 用户编号
					*/
					public String getYonghuUuidNumber() {
						return yonghuUuidNumber;
					}
					/**
					* 设置： 用户编号
					*/
					public void setYonghuUuidNumber(String yonghuUuidNumber) {
						this.yonghuUuidNumber = yonghuUuidNumber;
					}

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 现住址
					*/
					public String getYonghuAddress() {
						return yonghuAddress;
					}
					/**
					* 设置： 现住址
					*/
					public void setYonghuAddress(String yonghuAddress) {
						this.yonghuAddress = yonghuAddress;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}




}
