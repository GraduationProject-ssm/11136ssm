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


import com.dao.DiscussfangxingjieshaoDao;
import com.entity.DiscussfangxingjieshaoEntity;
import com.service.DiscussfangxingjieshaoService;
import com.entity.vo.DiscussfangxingjieshaoVO;
import com.entity.view.DiscussfangxingjieshaoView;

@Service("discussfangxingjieshaoService")
public class DiscussfangxingjieshaoServiceImpl extends ServiceImpl<DiscussfangxingjieshaoDao, DiscussfangxingjieshaoEntity> implements DiscussfangxingjieshaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfangxingjieshaoEntity> page = this.selectPage(
                new Query<DiscussfangxingjieshaoEntity>(params).getPage(),
                new EntityWrapper<DiscussfangxingjieshaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfangxingjieshaoEntity> wrapper) {
		  Page<DiscussfangxingjieshaoView> page =new Query<DiscussfangxingjieshaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfangxingjieshaoVO> selectListVO(Wrapper<DiscussfangxingjieshaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfangxingjieshaoVO selectVO(Wrapper<DiscussfangxingjieshaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfangxingjieshaoView> selectListView(Wrapper<DiscussfangxingjieshaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfangxingjieshaoView selectView(Wrapper<DiscussfangxingjieshaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
