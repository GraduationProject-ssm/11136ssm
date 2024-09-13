package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QinzihuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QinzihuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QinzihuodongView;


/**
 * 亲子活动
 *
 * @author 
 * @email 
 * @date 2020-10-16 17:06:22
 */
public interface QinzihuodongService extends IService<QinzihuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QinzihuodongVO> selectListVO(Wrapper<QinzihuodongEntity> wrapper);
   	
   	QinzihuodongVO selectVO(@Param("ew") Wrapper<QinzihuodongEntity> wrapper);
   	
   	List<QinzihuodongView> selectListView(Wrapper<QinzihuodongEntity> wrapper);
   	
   	QinzihuodongView selectView(@Param("ew") Wrapper<QinzihuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QinzihuodongEntity> wrapper);
   	
}

