package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KefangleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KefangleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KefangleibieView;


/**
 * 客房类别
 *
 * @author 
 * @email 
 * @date 2020-10-16 17:06:21
 */
public interface KefangleibieService extends IService<KefangleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KefangleibieVO> selectListVO(Wrapper<KefangleibieEntity> wrapper);
   	
   	KefangleibieVO selectVO(@Param("ew") Wrapper<KefangleibieEntity> wrapper);
   	
   	List<KefangleibieView> selectListView(Wrapper<KefangleibieEntity> wrapper);
   	
   	KefangleibieView selectView(@Param("ew") Wrapper<KefangleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KefangleibieEntity> wrapper);
   	
}

