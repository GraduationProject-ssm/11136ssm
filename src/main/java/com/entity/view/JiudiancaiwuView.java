package com.entity.view;

import com.entity.JiudiancaiwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 酒店财务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-16 17:06:23
 */
@TableName("jiudiancaiwu")
public class JiudiancaiwuView  extends JiudiancaiwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiudiancaiwuView(){
	}
 
 	public JiudiancaiwuView(JiudiancaiwuEntity jiudiancaiwuEntity){
 	try {
			BeanUtils.copyProperties(this, jiudiancaiwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
