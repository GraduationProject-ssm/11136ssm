package com.entity.view;

import com.entity.DiscussfangxingjieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 房型介绍评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-16 17:06:23
 */
@TableName("discussfangxingjieshao")
public class DiscussfangxingjieshaoView  extends DiscussfangxingjieshaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfangxingjieshaoView(){
	}
 
 	public DiscussfangxingjieshaoView(DiscussfangxingjieshaoEntity discussfangxingjieshaoEntity){
 	try {
			BeanUtils.copyProperties(this, discussfangxingjieshaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
