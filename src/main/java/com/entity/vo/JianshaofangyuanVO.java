package com.entity.vo;

import com.entity.JianshaofangyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 减少房源
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-10-16 17:06:22
 */
public class JianshaofangyuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 客房类型
	 */
	
	private String kefangleixing;
		
	/**
	 * 剩余房间
	 */
	
	private Integer shengyufangjian;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
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
	 * 设置：剩余房间
	 */
	 
	public void setShengyufangjian(Integer shengyufangjian) {
		this.shengyufangjian = shengyufangjian;
	}
	
	/**
	 * 获取：剩余房间
	 */
	public Integer getShengyufangjian() {
		return shengyufangjian;
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
