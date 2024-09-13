package com.entity.view;

import com.entity.JiudianzhoubianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 酒店周边
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-16 17:06:22
 */
@TableName("jiudianzhoubian")
public class JiudianzhoubianView  extends JiudianzhoubianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiudianzhoubianView(){
	}
 
 	public JiudianzhoubianView(JiudianzhoubianEntity jiudianzhoubianEntity){
 	try {
			BeanUtils.copyProperties(this, jiudianzhoubianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
