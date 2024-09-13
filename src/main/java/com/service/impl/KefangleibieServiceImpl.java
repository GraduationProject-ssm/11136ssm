package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KefangleibieDao;
import com.entity.KefangleibieEntity;
import com.service.KefangleibieService;
import com.entity.vo.KefangleibieVO;
import com.entity.view.KefangleibieView;

@Service("kefangleibieService")
public class KefangleibieServiceImpl extends ServiceImpl<KefangleibieDao, KefangleibieEntity> implements KefangleibieService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KefangleibieEntity> page = this.selectPage(
                new Query<KefangleibieEntity>(params).getPage(),
                new EntityWrapper<KefangleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KefangleibieEntity> wrapper) {
		  Page<KefangleibieView> page =new Query<KefangleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KefangleibieVO> selectListVO(Wrapper<KefangleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KefangleibieVO selectVO(Wrapper<KefangleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KefangleibieView> selectListView(Wrapper<KefangleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KefangleibieView selectView(Wrapper<KefangleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
