package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiudianzhoubianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiudianzhoubianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiudianzhoubianView;


/**
 * 酒店周边
 *
 * @author 
 * @email 
 * @date 2020-10-16 17:06:22
 */
public interface JiudianzhoubianService extends IService<JiudianzhoubianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiudianzhoubianVO> selectListVO(Wrapper<JiudianzhoubianEntity> wrapper);
   	
   	JiudianzhoubianVO selectVO(@Param("ew") Wrapper<JiudianzhoubianEntity> wrapper);
   	
   	List<JiudianzhoubianView> selectListView(Wrapper<JiudianzhoubianEntity> wrapper);
   	
   	JiudianzhoubianView selectView(@Param("ew") Wrapper<JiudianzhoubianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiudianzhoubianEntity> wrapper);
   	
}

