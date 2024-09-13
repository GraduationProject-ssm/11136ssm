package com.entity.vo;

import com.entity.JiudianzhoubianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 酒店周边
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-10-16 17:06:22
 */
public class JiudianzhoubianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 景点类型
	 */
	
	private String jingdianleixing;
		
	/**
	 * 景点封面
	 */
	
	private String jingdianfengmian;
		
	/**
	 * 开放时间
	 */
	
	private String kaifangshijian;
		
	/**
	 * 景点地址
	 */
	
	private String jingdiandizhi;
		
	/**
	 * 景点介绍
	 */
	
	private String jingdianjieshao;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：景点类型
	 */
	 
	public void setJingdianleixing(String jingdianleixing) {
		this.jingdianleixing = jingdianleixing;
	}
	
	/**
	 * 获取：景点类型
	 */
	public String getJingdianleixing() {
		return jingdianleixing;
	}
				
	
	/**
	 * 设置：景点封面
	 */
	 
	public void setJingdianfengmian(String jingdianfengmian) {
		this.jingdianfengmian = jingdianfengmian;
	}
	
	/**
	 * 获取：景点封面
	 */
	public String getJingdianfengmian() {
		return jingdianfengmian;
	}
				
	
	/**
	 * 设置：开放时间
	 */
	 
	public void setKaifangshijian(String kaifangshijian) {
		this.kaifangshijian = kaifangshijian;
	}
	
	/**
	 * 获取：开放时间
	 */
	public String getKaifangshijian() {
		return kaifangshijian;
	}
				
	
	/**
	 * 设置：景点地址
	 */
	 
	public void setJingdiandizhi(String jingdiandizhi) {
		this.jingdiandizhi = jingdiandizhi;
	}
	
	/**
	 * 获取：景点地址
	 */
	public String getJingdiandizhi() {
		return jingdiandizhi;
	}
				
	
	/**
	 * 设置：景点介绍
	 */
	 
	public void setJingdianjieshao(String jingdianjieshao) {
		this.jingdianjieshao = jingdianjieshao;
	}
	
	/**
	 * 获取：景点介绍
	 */
	public String getJingdianjieshao() {
		return jingdianjieshao;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
