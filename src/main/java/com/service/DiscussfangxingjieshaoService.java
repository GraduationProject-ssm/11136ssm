package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfangxingjieshaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfangxingjieshaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfangxingjieshaoView;


/**
 * 房型介绍评论表
 *
 * @author 
 * @email 
 * @date 2020-10-16 17:06:23
 */
public interface DiscussfangxingjieshaoService extends IService<DiscussfangxingjieshaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfangxingjieshaoVO> selectListVO(Wrapper<DiscussfangxingjieshaoEntity> wrapper);
   	
   	DiscussfangxingjieshaoVO selectVO(@Param("ew") Wrapper<DiscussfangxingjieshaoEntity> wrapper);
   	
   	List<DiscussfangxingjieshaoView> selectListView(Wrapper<DiscussfangxingjieshaoEntity> wrapper);
   	
   	DiscussfangxingjieshaoView selectView(@Param("ew") Wrapper<DiscussfangxingjieshaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfangxingjieshaoEntity> wrapper);
   	
}

