package com.dao;

import com.entity.ZengjiafangyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZengjiafangyuanVO;
import com.entity.view.ZengjiafangyuanView;


/**
 * 增加房源
 * 
 * @author 
 * @email 
 * @date 2020-10-16 17:06:21
 */
public interface ZengjiafangyuanDao extends BaseMapper<ZengjiafangyuanEntity> {
	
	List<ZengjiafangyuanVO> selectListVO(@Param("ew") Wrapper<ZengjiafangyuanEntity> wrapper);
	
	ZengjiafangyuanVO selectVO(@Param("ew") Wrapper<ZengjiafangyuanEntity> wrapper);
	
	List<ZengjiafangyuanView> selectListView(@Param("ew") Wrapper<ZengjiafangyuanEntity> wrapper);

	List<ZengjiafangyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ZengjiafangyuanEntity> wrapper);
	
	ZengjiafangyuanView selectView(@Param("ew") Wrapper<ZengjiafangyuanEntity> wrapper);
	
}
