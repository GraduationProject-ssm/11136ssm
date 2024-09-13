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


import com.dao.JianshaofangyuanDao;
import com.entity.JianshaofangyuanEntity;
import com.service.JianshaofangyuanService;
import com.entity.vo.JianshaofangyuanVO;
import com.entity.view.JianshaofangyuanView;

@Service("jianshaofangyuanService")
public class JianshaofangyuanServiceImpl extends ServiceImpl<JianshaofangyuanDao, JianshaofangyuanEntity> implements JianshaofangyuanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianshaofangyuanEntity> page = this.selectPage(
                new Query<JianshaofangyuanEntity>(params).getPage(),
                new EntityWrapper<JianshaofangyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianshaofangyuanEntity> wrapper) {
		  Page<JianshaofangyuanView> page =new Query<JianshaofangyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianshaofangyuanVO> selectListVO(Wrapper<JianshaofangyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianshaofangyuanVO selectVO(Wrapper<JianshaofangyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianshaofangyuanView> selectListView(Wrapper<JianshaofangyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianshaofangyuanView selectView(Wrapper<JianshaofangyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
