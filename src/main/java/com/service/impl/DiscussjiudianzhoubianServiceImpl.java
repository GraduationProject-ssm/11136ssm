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


import com.dao.DiscussjiudianzhoubianDao;
import com.entity.DiscussjiudianzhoubianEntity;
import com.service.DiscussjiudianzhoubianService;
import com.entity.vo.DiscussjiudianzhoubianVO;
import com.entity.view.DiscussjiudianzhoubianView;

@Service("discussjiudianzhoubianService")
public class DiscussjiudianzhoubianServiceImpl extends ServiceImpl<DiscussjiudianzhoubianDao, DiscussjiudianzhoubianEntity> implements DiscussjiudianzhoubianService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiudianzhoubianEntity> page = this.selectPage(
                new Query<DiscussjiudianzhoubianEntity>(params).getPage(),
                new EntityWrapper<DiscussjiudianzhoubianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiudianzhoubianEntity> wrapper) {
		  Page<DiscussjiudianzhoubianView> page =new Query<DiscussjiudianzhoubianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiudianzhoubianVO> selectListVO(Wrapper<DiscussjiudianzhoubianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiudianzhoubianVO selectVO(Wrapper<DiscussjiudianzhoubianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiudianzhoubianView> selectListView(Wrapper<DiscussjiudianzhoubianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiudianzhoubianView selectView(Wrapper<DiscussjiudianzhoubianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
