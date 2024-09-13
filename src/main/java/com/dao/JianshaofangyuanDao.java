package com.dao;

import com.entity.JianshaofangyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianshaofangyuanVO;
import com.entity.view.JianshaofangyuanView;


/**
 * 减少房源
 * 
 * @author 
 * @email 
 * @date 2020-10-16 17:06:22
 */
public interface JianshaofangyuanDao extends BaseMapper<JianshaofangyuanEntity> {
	
	List<JianshaofangyuanVO> selectListVO(@Param("ew") Wrapper<JianshaofangyuanEntity> wrapper);
	
	JianshaofangyuanVO selectVO(@Param("ew") Wrapper<JianshaofangyuanEntity> wrapper);
	
	List<JianshaofangyuanView> selectListView(@Param("ew") Wrapper<JianshaofangyuanEntity> wrapper);

	List<JianshaofangyuanView> selectListView(Pagination page,@Param("ew") Wrapper<JianshaofangyuanEntity> wrapper);
	
	JianshaofangyuanView selectView(@Param("ew") Wrapper<JianshaofangyuanEntity> wrapper);
	
}
