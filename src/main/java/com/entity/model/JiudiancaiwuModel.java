package com.entity.model;

import com.entity.JiudiancaiwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 酒店财务
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-10-16 17:06:23
 */
public class JiudiancaiwuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 年份
	 */
	
	private String nianfen;
		
	/**
	 * 月份
	 */
	
	private String yuefen;
		
	/**
	 * 客房收入
	 */
	
	private Integer kefangshouru;
		
	/**
	 * 其他收入
	 */
	
	private String qitashouru;
		
	/**
	 * 收入金额
	 */
	
	private Integer shourujine;
		
	/**
	 * 支出金额
	 */
	
	private Integer zhichujine;
		
	/**
	 * 结余金额
	 */
	
	private String jieyujine;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
	/**
	 * 设置：年份
	 */
	 
	public void setNianfen(String nianfen) {
		this.nianfen = nianfen;
	}
	
	/**
	 * 获取：年份
	 */
	public String getNianfen() {
		return nianfen;
	}
				
	
	/**
	 * 设置：月份
	 */
	 
	public void setYuefen(String yuefen) {
		this.yuefen = yuefen;
	}
	
	/**
	 * 获取：月份
	 */
	public String getYuefen() {
		return yuefen;
	}
				
	
	/**
	 * 设置：客房收入
	 */
	 
	public void setKefangshouru(Integer kefangshouru) {
		this.kefangshouru = kefangshouru;
	}
	
	/**
	 * 获取：客房收入
	 */
	public Integer getKefangshouru() {
		return kefangshouru;
	}
				
	
	/**
	 * 设置：其他收入
	 */
	 
	public void setQitashouru(String qitashouru) {
		this.qitashouru = qitashouru;
	}
	
	/**
	 * 获取：其他收入
	 */
	public String getQitashouru() {
		return qitashouru;
	}
				
	
	/**
	 * 设置：收入金额
	 */
	 
	public void setShourujine(Integer shourujine) {
		this.shourujine = shourujine;
	}
	
	/**
	 * 获取：收入金额
	 */
	public Integer getShourujine() {
		return shourujine;
	}
				
	
	/**
	 * 设置：支出金额
	 */
	 
	public void setZhichujine(Integer zhichujine) {
		this.zhichujine = zhichujine;
	}
	
	/**
	 * 获取：支出金额
	 */
	public Integer getZhichujine() {
		return zhichujine;
	}
				
	
	/**
	 * 设置：结余金额
	 */
	 
	public void setJieyujine(String jieyujine) {
		this.jieyujine = jieyujine;
	}
	
	/**
	 * 获取：结余金额
	 */
	public String getJieyujine() {
		return jieyujine;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
			
}
