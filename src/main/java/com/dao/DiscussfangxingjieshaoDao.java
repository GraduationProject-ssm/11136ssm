package com.dao;

import com.entity.DiscussfangxingjieshaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfangxingjieshaoVO;
import com.entity.view.DiscussfangxingjieshaoView;


/**
 * 房型介绍评论表
 * 
 * @author 
 * @email 
 * @date 2020-10-16 17:06:23
 */
public interface DiscussfangxingjieshaoDao extends BaseMapper<DiscussfangxingjieshaoEntity> {
	
	List<DiscussfangxingjieshaoVO> selectListVO(@Param("ew") Wrapper<DiscussfangxingjieshaoEntity> wrapper);
	
	DiscussfangxingjieshaoVO selectVO(@Param("ew") Wrapper<DiscussfangxingjieshaoEntity> wrapper);
	
	List<DiscussfangxingjieshaoView> selectListView(@Param("ew") Wrapper<DiscussfangxingjieshaoEntity> wrapper);

	List<DiscussfangxingjieshaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfangxingjieshaoEntity> wrapper);
	
	DiscussfangxingjieshaoView selectView(@Param("ew") Wrapper<DiscussfangxingjieshaoEntity> wrapper);
	
}
