package com.dao;

import com.entity.KefangleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KefangleibieVO;
import com.entity.view.KefangleibieView;


/**
 * 客房类别
 * 
 * @author 
 * @email 
 * @date 2020-10-16 17:06:21
 */
public interface KefangleibieDao extends BaseMapper<KefangleibieEntity> {
	
	List<KefangleibieVO> selectListVO(@Param("ew") Wrapper<KefangleibieEntity> wrapper);
	
	KefangleibieVO selectVO(@Param("ew") Wrapper<KefangleibieEntity> wrapper);
	
	List<KefangleibieView> selectListView(@Param("ew") Wrapper<KefangleibieEntity> wrapper);

	List<KefangleibieView> selectListView(Pagination page,@Param("ew") Wrapper<KefangleibieEntity> wrapper);
	
	KefangleibieView selectView(@Param("ew") Wrapper<KefangleibieEntity> wrapper);
	
}
