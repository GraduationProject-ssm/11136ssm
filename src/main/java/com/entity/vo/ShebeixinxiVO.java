package com.entity.vo;

import com.entity.ShebeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 设备信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-10-16 17:06:22
 */
public class ShebeixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 设备图片
	 */
	
	private String shebeitupian;
		
	/**
	 * 使用区域
	 */
	
	private String shiyongquyu;
		
	/**
	 * 设备状态
	 */
	
	private String shebeizhuangtai;
		
	/**
	 * 设备详情
	 */
	
	private String shebeixiangqing;
				
	
	/**
	 * 设置：设备名称
	 */
	 
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
	}
				
	
	/**
	 * 设置：设备图片
	 */
	 
	public void setShebeitupian(String shebeitupian) {
		this.shebeitupian = shebeitupian;
	}
	
	/**
	 * 获取：设备图片
	 */
	public String getShebeitupian() {
		return shebeitupian;
	}
				
	
	/**
	 * 设置：使用区域
	 */
	 
	public void setShiyongquyu(String shiyongquyu) {
		this.shiyongquyu = shiyongquyu;
	}
	
	/**
	 * 获取：使用区域
	 */
	public String getShiyongquyu() {
		return shiyongquyu;
	}
				
	
	/**
	 * 设置：设备状态
	 */
	 
	public void setShebeizhuangtai(String shebeizhuangtai) {
		this.shebeizhuangtai = shebeizhuangtai;
	}
	
	/**
	 * 获取：设备状态
	 */
	public String getShebeizhuangtai() {
		return shebeizhuangtai;
	}
				
	
	/**
	 * 设置：设备详情
	 */
	 
	public void setShebeixiangqing(String shebeixiangqing) {
		this.shebeixiangqing = shebeixiangqing;
	}
	
	/**
	 * 获取：设备详情
	 */
	public String getShebeixiangqing() {
		return shebeixiangqing;
	}
			
}
