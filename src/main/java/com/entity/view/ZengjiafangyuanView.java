package com.entity.view;

import com.entity.ZengjiafangyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 增加房源
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-16 17:06:21
 */
@TableName("zengjiafangyuan")
public class ZengjiafangyuanView  extends ZengjiafangyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZengjiafangyuanView(){
	}
 
 	public ZengjiafangyuanView(ZengjiafangyuanEntity zengjiafangyuanEntity){
 	try {
			BeanUtils.copyProperties(this, zengjiafangyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
