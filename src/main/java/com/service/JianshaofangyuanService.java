package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianshaofangyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianshaofangyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianshaofangyuanView;


/**
 * 减少房源
 *
 * @author 
 * @email 
 * @date 2020-10-16 17:06:22
 */
public interface JianshaofangyuanService extends IService<JianshaofangyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshaofangyuanVO> selectListVO(Wrapper<JianshaofangyuanEntity> wrapper);
   	
   	JianshaofangyuanVO selectVO(@Param("ew") Wrapper<JianshaofangyuanEntity> wrapper);
   	
   	List<JianshaofangyuanView> selectListView(Wrapper<JianshaofangyuanEntity> wrapper);
   	
   	JianshaofangyuanView selectView(@Param("ew") Wrapper<JianshaofangyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshaofangyuanEntity> wrapper);
   	
}

