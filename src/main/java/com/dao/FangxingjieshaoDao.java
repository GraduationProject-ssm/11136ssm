package com.dao;

import com.entity.FangxingjieshaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangxingjieshaoVO;
import com.entity.view.FangxingjieshaoView;


/**
 * 房型介绍
 * 
 * @author 
 * @email 
 * @date 2020-10-16 17:06:22
 */
public interface FangxingjieshaoDao extends BaseMapper<FangxingjieshaoEntity> {
	
	List<FangxingjieshaoVO> selectListVO(@Param("ew") Wrapper<FangxingjieshaoEntity> wrapper);
	
	FangxingjieshaoVO selectVO(@Param("ew") Wrapper<FangxingjieshaoEntity> wrapper);
	
	List<FangxingjieshaoView> selectListView(@Param("ew") Wrapper<FangxingjieshaoEntity> wrapper);

	List<FangxingjieshaoView> selectListView(Pagination page,@Param("ew") Wrapper<FangxingjieshaoEntity> wrapper);
	
	FangxingjieshaoView selectView(@Param("ew") Wrapper<FangxingjieshaoEntity> wrapper);
	
}
