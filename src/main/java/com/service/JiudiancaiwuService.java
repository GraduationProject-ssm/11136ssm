package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiudiancaiwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiudiancaiwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiudiancaiwuView;


/**
 * 酒店财务
 *
 * @author 
 * @email 
 * @date 2020-10-16 17:06:23
 */
public interface JiudiancaiwuService extends IService<JiudiancaiwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiudiancaiwuVO> selectListVO(Wrapper<JiudiancaiwuEntity> wrapper);
   	
   	JiudiancaiwuVO selectVO(@Param("ew") Wrapper<JiudiancaiwuEntity> wrapper);
   	
   	List<JiudiancaiwuView> selectListView(Wrapper<JiudiancaiwuEntity> wrapper);
   	
   	JiudiancaiwuView selectView(@Param("ew") Wrapper<JiudiancaiwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiudiancaiwuEntity> wrapper);
   	
}

