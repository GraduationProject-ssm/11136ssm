package com.dao;

import com.entity.JiudianzhoubianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiudianzhoubianVO;
import com.entity.view.JiudianzhoubianView;


/**
 * 酒店周边
 * 
 * @author 
 * @email 
 * @date 2020-10-16 17:06:22
 */
public interface JiudianzhoubianDao extends BaseMapper<JiudianzhoubianEntity> {
	
	List<JiudianzhoubianVO> selectListVO(@Param("ew") Wrapper<JiudianzhoubianEntity> wrapper);
	
	JiudianzhoubianVO selectVO(@Param("ew") Wrapper<JiudianzhoubianEntity> wrapper);
	
	List<JiudianzhoubianView> selectListView(@Param("ew") Wrapper<JiudianzhoubianEntity> wrapper);

	List<JiudianzhoubianView> selectListView(Pagination page,@Param("ew") Wrapper<JiudianzhoubianEntity> wrapper);
	
	JiudianzhoubianView selectView(@Param("ew") Wrapper<JiudianzhoubianEntity> wrapper);
	
}
