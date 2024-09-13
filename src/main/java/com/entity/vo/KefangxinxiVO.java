package com.entity.vo;

import com.entity.KefangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 客房信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-10-16 17:06:21
 */
public class KefangxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 客房类型
	 */
	
	private String kefangleixing;
		
	/**
	 * 客房类别
	 */
	
	private String kefangleibie;
		
	/**
	 * 客房照片
	 */
	
	private String kefangzhaopian;
		
	/**
	 * 客房面积
	 */
	
	private String kefangmianji;
		
	/**
	 * 客房楼层
	 */
	
	private String kefanglouceng;
		
	/**
	 * 免费宽带
	 */
	
	private String mianfeikuandai;
		
	/**
	 * 门市价
	 */
	
	private Integer menshijia;
		
	/**
	 * 剩余房间
	 */
	
	private Integer shengyufangjian;
		
	/**
	 * 客房介绍
	 */
	
	private String kefangjieshao;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
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
	 * 设置：客房照片
	 */
	 
	public void setKefangzhaopian(String kefangzhaopian) {
		this.kefangzhaopian = kefangzhaopian;
	}
	
	/**
	 * 获取：客房照片
	 */
	public String getKefangzhaopian() {
		return kefangzhaopian;
	}
				
	
	/**
	 * 设置：客房面积
	 */
	 
	public void setKefangmianji(String kefangmianji) {
		this.kefangmianji = kefangmianji;
	}
	
	/**
	 * 获取：客房面积
	 */
	public String getKefangmianji() {
		return kefangmianji;
	}
				
	
	/**
	 * 设置：客房楼层
	 */
	 
	public void setKefanglouceng(String kefanglouceng) {
		this.kefanglouceng = kefanglouceng;
	}
	
	/**
	 * 获取：客房楼层
	 */
	public String getKefanglouceng() {
		return kefanglouceng;
	}
				
	
	/**
	 * 设置：免费宽带
	 */
	 
	public void setMianfeikuandai(String mianfeikuandai) {
		this.mianfeikuandai = mianfeikuandai;
	}
	
	/**
	 * 获取：免费宽带
	 */
	public String getMianfeikuandai() {
		return mianfeikuandai;
	}
				
	
	/**
	 * 设置：门市价
	 */
	 
	public void setMenshijia(Integer menshijia) {
		this.menshijia = menshijia;
	}
	
	/**
	 * 获取：门市价
	 */
	public Integer getMenshijia() {
		return menshijia;
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
	 * 设置：客房介绍
	 */
	 
	public void setKefangjieshao(String kefangjieshao) {
		this.kefangjieshao = kefangjieshao;
	}
	
	/**
	 * 获取：客房介绍
	 */
	public String getKefangjieshao() {
		return kefangjieshao;
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
