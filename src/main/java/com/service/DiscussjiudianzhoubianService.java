package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiudianzhoubianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiudianzhoubianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiudianzhoubianView;


/**
 * 酒店周边评论表
 *
 * @author 
 * @email 
 * @date 2020-10-16 17:06:23
 */
public interface DiscussjiudianzhoubianService extends IService<DiscussjiudianzhoubianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiudianzhoubianVO> selectListVO(Wrapper<DiscussjiudianzhoubianEntity> wrapper);
   	
   	DiscussjiudianzhoubianVO selectVO(@Param("ew") Wrapper<DiscussjiudianzhoubianEntity> wrapper);
   	
   	List<DiscussjiudianzhoubianView> selectListView(Wrapper<DiscussjiudianzhoubianEntity> wrapper);
   	
   	DiscussjiudianzhoubianView selectView(@Param("ew") Wrapper<DiscussjiudianzhoubianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiudianzhoubianEntity> wrapper);
   	
}

