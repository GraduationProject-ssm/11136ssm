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
 * 客房预订
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-10-16 17:06:22
 */
@TableName("kefangyuding")
public class KefangyudingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KefangyudingEntity() {
		
	}
	
	public KefangyudingEntity(T t) {
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
	 * 客房类型
	 */
					
	private String kefangleixing;
	
	/**
	 * 客房类别
	 */
					
	private String kefangleibie;
	
	/**
	 * 门市价
	 */
					
	private String menshijia;
	
	/**
	 * 剩余房间
	 */
					
	private String shengyufangjian;
	
	/**
	 * 预定数量
	 */
					
	private Integer yudingshuliang;
	
	/**
	 * 入住天数
	 */
					
	private Integer ruzhutianshu;
	
	/**
	 * 入住日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date ruzhuriqi;
	
	/**
	 * 实付金额
	 */
					
	private String shifujine;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 预定时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yudingshijian;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：客房类型
	 */
	public void setKefangleixing(String kefangleixing) {
		this.kefangleixing = kefangleixing;
	}
	/**
	 * 获取：客房类型
	 */
	public String getKefangleixing() {
		return kefangleixing;
	}
	/**
	 * 设置：客房类别
	 */
	public void setKefangleibie(String kefangleibie) {
		this.kefangleibie = kefangleibie;
	}
	/**
	 * 获取：客房类别
	 */
	public String getKefangleibie() {
		return kefangleibie;
	}
	/**
	 * 设置：门市价
	 */
	public void setMenshijia(String menshijia) {
		this.menshijia = menshijia;
	}
	/**
	 * 获取：门市价
	 */
	public String getMenshijia() {
		return menshijia;
	}
	/**
	 * 设置：剩余房间
	 */
	public void setShengyufangjian(String shengyufangjian) {
		this.shengyufangjian = shengyufangjian;
	}
	/**
	 * 获取：剩余房间
	 */
	public String getShengyufangjian() {
		return shengyufangjian;
	}
	/**
	 * 设置：预定数量
	 */
	public void setYudingshuliang(Integer yudingshuliang) {
		this.yudingshuliang = yudingshuliang;
	}
	/**
	 * 获取：预定数量
	 */
	public Integer getYudingshuliang() {
		return yudingshuliang;
	}
	/**
	 * 设置：入住天数
	 */
	public void setRuzhutianshu(Integer ruzhutianshu) {
		this.ruzhutianshu = ruzhutianshu;
	}
	/**
	 * 获取：入住天数
	 */
	public Integer getRuzhutianshu() {
		return ruzhutianshu;
	}
	/**
	 * 设置：入住日期
	 */
	public void setRuzhuriqi(Date ruzhuriqi) {
		this.ruzhuriqi = ruzhuriqi;
	}
	/**
	 * 获取：入住日期
	 */
	public Date getRuzhuriqi() {
		return ruzhuriqi;
	}
	/**
	 * 设置：实付金额
	 */
	public void setShifujine(String shifujine) {
		this.shifujine = shifujine;
	}
	/**
	 * 获取：实付金额
	 */
	public String getShifujine() {
		return shifujine;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：预定时间
	 */
	public void setYudingshijian(Date yudingshijian) {
		this.yudingshijian = yudingshijian;
	}
	/**
	 * 获取：预定时间
	 */
	public Date getYudingshijian() {
		return yudingshijian;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
