package com.entity.view;

import com.entity.KefangleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 客房类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-16 17:06:21
 */
@TableName("kefangleibie")
public class KefangleibieView  extends KefangleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KefangleibieView(){
	}
 
 	public KefangleibieView(KefangleibieEntity kefangleibieEntity){
 	try {
			BeanUtils.copyProperties(this, kefangleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
