package com.entity.view;

import com.entity.DiscussjiudianzhoubianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 酒店周边评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-16 17:06:23
 */
@TableName("discussjiudianzhoubian")
public class DiscussjiudianzhoubianView  extends DiscussjiudianzhoubianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiudianzhoubianView(){
	}
 
 	public DiscussjiudianzhoubianView(DiscussjiudianzhoubianEntity discussjiudianzhoubianEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiudianzhoubianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
