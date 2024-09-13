package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangxingjieshaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangxingjieshaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangxingjieshaoView;


/**
 * 房型介绍
 *
 * @author 
 * @email 
 * @date 2020-10-16 17:06:22
 */
public interface FangxingjieshaoService extends IService<FangxingjieshaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangxingjieshaoVO> selectListVO(Wrapper<FangxingjieshaoEntity> wrapper);
   	
   	FangxingjieshaoVO selectVO(@Param("ew") Wrapper<FangxingjieshaoEntity> wrapper);
   	
   	List<FangxingjieshaoView> selectListView(Wrapper<FangxingjieshaoEntity> wrapper);
   	
   	FangxingjieshaoView selectView(@Param("ew") Wrapper<FangxingjieshaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangxingjieshaoEntity> wrapper);
   	
}

