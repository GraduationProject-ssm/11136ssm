package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZengjiafangyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZengjiafangyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZengjiafangyuanView;


/**
 * 增加房源
 *
 * @author 
 * @email 
 * @date 2020-10-16 17:06:21
 */
public interface ZengjiafangyuanService extends IService<ZengjiafangyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZengjiafangyuanVO> selectListVO(Wrapper<ZengjiafangyuanEntity> wrapper);
   	
   	ZengjiafangyuanVO selectVO(@Param("ew") Wrapper<ZengjiafangyuanEntity> wrapper);
   	
   	List<ZengjiafangyuanView> selectListView(Wrapper<ZengjiafangyuanEntity> wrapper);
   	
   	ZengjiafangyuanView selectView(@Param("ew") Wrapper<ZengjiafangyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZengjiafangyuanEntity> wrapper);
   	
}

