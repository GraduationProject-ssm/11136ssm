package com.dao;

import com.entity.QinzihuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QinzihuodongVO;
import com.entity.view.QinzihuodongView;


/**
 * 亲子活动
 * 
 * @author 
 * @email 
 * @date 2020-10-16 17:06:22
 */
public interface QinzihuodongDao extends BaseMapper<QinzihuodongEntity> {
	
	List<QinzihuodongVO> selectListVO(@Param("ew") Wrapper<QinzihuodongEntity> wrapper);
	
	QinzihuodongVO selectVO(@Param("ew") Wrapper<QinzihuodongEntity> wrapper);
	
	List<QinzihuodongView> selectListView(@Param("ew") Wrapper<QinzihuodongEntity> wrapper);

	List<QinzihuodongView> selectListView(Pagination page,@Param("ew") Wrapper<QinzihuodongEntity> wrapper);
	
	QinzihuodongView selectView(@Param("ew") Wrapper<QinzihuodongEntity> wrapper);
	
}
