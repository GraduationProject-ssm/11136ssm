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


import com.dao.JiudiancaiwuDao;
import com.entity.JiudiancaiwuEntity;
import com.service.JiudiancaiwuService;
import com.entity.vo.JiudiancaiwuVO;
import com.entity.view.JiudiancaiwuView;

@Service("jiudiancaiwuService")
public class JiudiancaiwuServiceImpl extends ServiceImpl<JiudiancaiwuDao, JiudiancaiwuEntity> implements JiudiancaiwuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiudiancaiwuEntity> page = this.selectPage(
                new Query<JiudiancaiwuEntity>(params).getPage(),
                new EntityWrapper<JiudiancaiwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiudiancaiwuEntity> wrapper) {
		  Page<JiudiancaiwuView> page =new Query<JiudiancaiwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiudiancaiwuVO> selectListVO(Wrapper<JiudiancaiwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiudiancaiwuVO selectVO(Wrapper<JiudiancaiwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiudiancaiwuView> selectListView(Wrapper<JiudiancaiwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiudiancaiwuView selectView(Wrapper<JiudiancaiwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
