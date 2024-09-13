package com.entity.view;

import com.entity.DiscussqinzihuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 亲子活动评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-16 17:06:23
 */
@TableName("discussqinzihuodong")
public class DiscussqinzihuodongView  extends DiscussqinzihuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussqinzihuodongView(){
	}
 
 	public DiscussqinzihuodongView(DiscussqinzihuodongEntity discussqinzihuodongEntity){
 	try {
			BeanUtils.copyProperties(this, discussqinzihuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
