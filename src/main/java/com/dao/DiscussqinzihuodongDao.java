package com.dao;

import com.entity.DiscussqinzihuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussqinzihuodongVO;
import com.entity.view.DiscussqinzihuodongView;


/**
 * 亲子活动评论表
 * 
 * @author 
 * @email 
 * @date 2020-10-16 17:06:23
 */
public interface DiscussqinzihuodongDao extends BaseMapper<DiscussqinzihuodongEntity> {
	
	List<DiscussqinzihuodongVO> selectListVO(@Param("ew") Wrapper<DiscussqinzihuodongEntity> wrapper);
	
	DiscussqinzihuodongVO selectVO(@Param("ew") Wrapper<DiscussqinzihuodongEntity> wrapper);
	
	List<DiscussqinzihuodongView> selectListView(@Param("ew") Wrapper<DiscussqinzihuodongEntity> wrapper);

	List<DiscussqinzihuodongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqinzihuodongEntity> wrapper);
	
	DiscussqinzihuodongView selectView(@Param("ew") Wrapper<DiscussqinzihuodongEntity> wrapper);
	
}
