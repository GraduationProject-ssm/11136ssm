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


import com.dao.DiscussqinzihuodongDao;
import com.entity.DiscussqinzihuodongEntity;
import com.service.DiscussqinzihuodongService;
import com.entity.vo.DiscussqinzihuodongVO;
import com.entity.view.DiscussqinzihuodongView;

@Service("discussqinzihuodongService")
public class DiscussqinzihuodongServiceImpl extends ServiceImpl<DiscussqinzihuodongDao, DiscussqinzihuodongEntity> implements DiscussqinzihuodongService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqinzihuodongEntity> page = this.selectPage(
                new Query<DiscussqinzihuodongEntity>(params).getPage(),
                new EntityWrapper<DiscussqinzihuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqinzihuodongEntity> wrapper) {
		  Page<DiscussqinzihuodongView> page =new Query<DiscussqinzihuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussqinzihuodongVO> selectListVO(Wrapper<DiscussqinzihuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussqinzihuodongVO selectVO(Wrapper<DiscussqinzihuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussqinzihuodongView> selectListView(Wrapper<DiscussqinzihuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqinzihuodongView selectView(Wrapper<DiscussqinzihuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
