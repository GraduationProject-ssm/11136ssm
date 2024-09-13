package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussqinzihuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussqinzihuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussqinzihuodongView;


/**
 * 亲子活动评论表
 *
 * @author 
 * @email 
 * @date 2020-10-16 17:06:23
 */
public interface DiscussqinzihuodongService extends IService<DiscussqinzihuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqinzihuodongVO> selectListVO(Wrapper<DiscussqinzihuodongEntity> wrapper);
   	
   	DiscussqinzihuodongVO selectVO(@Param("ew") Wrapper<DiscussqinzihuodongEntity> wrapper);
   	
   	List<DiscussqinzihuodongView> selectListView(Wrapper<DiscussqinzihuodongEntity> wrapper);
   	
   	DiscussqinzihuodongView selectView(@Param("ew") Wrapper<DiscussqinzihuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqinzihuodongEntity> wrapper);
   	
}

