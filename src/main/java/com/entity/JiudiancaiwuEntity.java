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
 * 酒店财务
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-10-16 17:06:23
 */
@TableName("jiudiancaiwu")
public class JiudiancaiwuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiudiancaiwuEntity() {
		
	}
	
	public JiudiancaiwuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 财务标题
	 */
					
	private String caiwubiaoti;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：财务标题
	 */
	public void setCaiwubiaoti(String caiwubiaoti) {
		this.caiwubiaoti = caiwubiaoti;
	}
	/**
	 * 获取：财务标题
	 */
	public String getCaiwubiaoti() {
		return caiwubiaoti;
	}
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
