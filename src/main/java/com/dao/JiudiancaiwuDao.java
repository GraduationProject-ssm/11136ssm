package com.dao;

import com.entity.JiudiancaiwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiudiancaiwuVO;
import com.entity.view.JiudiancaiwuView;


/**
 * 酒店财务
 * 
 * @author 
 * @email 
 * @date 2020-10-16 17:06:23
 */
public interface JiudiancaiwuDao extends BaseMapper<JiudiancaiwuEntity> {
	
	List<JiudiancaiwuVO> selectListVO(@Param("ew") Wrapper<JiudiancaiwuEntity> wrapper);
	
	JiudiancaiwuVO selectVO(@Param("ew") Wrapper<JiudiancaiwuEntity> wrapper);
	
	List<JiudiancaiwuView> selectListView(@Param("ew") Wrapper<JiudiancaiwuEntity> wrapper);

	List<JiudiancaiwuView> selectListView(Pagination page,@Param("ew") Wrapper<JiudiancaiwuEntity> wrapper);
	
	JiudiancaiwuView selectView(@Param("ew") Wrapper<JiudiancaiwuEntity> wrapper);
	
}
