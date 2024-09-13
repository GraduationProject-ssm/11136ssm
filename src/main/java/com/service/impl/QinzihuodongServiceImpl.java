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


import com.dao.QinzihuodongDao;
import com.entity.QinzihuodongEntity;
import com.service.QinzihuodongService;
import com.entity.vo.QinzihuodongVO;
import com.entity.view.QinzihuodongView;

@Service("qinzihuodongService")
public class QinzihuodongServiceImpl extends ServiceImpl<QinzihuodongDao, QinzihuodongEntity> implements QinzihuodongService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QinzihuodongEntity> page = this.selectPage(
                new Query<QinzihuodongEntity>(params).getPage(),
                new EntityWrapper<QinzihuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QinzihuodongEntity> wrapper) {
		  Page<QinzihuodongView> page =new Query<QinzihuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QinzihuodongVO> selectListVO(Wrapper<QinzihuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QinzihuodongVO selectVO(Wrapper<QinzihuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QinzihuodongView> selectListView(Wrapper<QinzihuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QinzihuodongView selectView(Wrapper<QinzihuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
