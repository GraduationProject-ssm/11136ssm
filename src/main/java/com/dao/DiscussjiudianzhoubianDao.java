package com.dao;

import com.entity.DiscussjiudianzhoubianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiudianzhoubianVO;
import com.entity.view.DiscussjiudianzhoubianView;


/**
 * 酒店周边评论表
 * 
 * @author 
 * @email 
 * @date 2020-10-16 17:06:23
 */
public interface DiscussjiudianzhoubianDao extends BaseMapper<DiscussjiudianzhoubianEntity> {
	
	List<DiscussjiudianzhoubianVO> selectListVO(@Param("ew") Wrapper<DiscussjiudianzhoubianEntity> wrapper);
	
	DiscussjiudianzhoubianVO selectVO(@Param("ew") Wrapper<DiscussjiudianzhoubianEntity> wrapper);
	
	List<DiscussjiudianzhoubianView> selectListView(@Param("ew") Wrapper<DiscussjiudianzhoubianEntity> wrapper);

	List<DiscussjiudianzhoubianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiudianzhoubianEntity> wrapper);
	
	DiscussjiudianzhoubianView selectView(@Param("ew") Wrapper<DiscussjiudianzhoubianEntity> wrapper);
	
}
