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


import com.dao.JiudianzhoubianDao;
import com.entity.JiudianzhoubianEntity;
import com.service.JiudianzhoubianService;
import com.entity.vo.JiudianzhoubianVO;
import com.entity.view.JiudianzhoubianView;

@Service("jiudianzhoubianService")
public class JiudianzhoubianServiceImpl extends ServiceImpl<JiudianzhoubianDao, JiudianzhoubianEntity> implements JiudianzhoubianService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiudianzhoubianEntity> page = this.selectPage(
                new Query<JiudianzhoubianEntity>(params).getPage(),
                new EntityWrapper<JiudianzhoubianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiudianzhoubianEntity> wrapper) {
		  Page<JiudianzhoubianView> page =new Query<JiudianzhoubianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiudianzhoubianVO> selectListVO(Wrapper<JiudianzhoubianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiudianzhoubianVO selectVO(Wrapper<JiudianzhoubianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiudianzhoubianView> selectListView(Wrapper<JiudianzhoubianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiudianzhoubianView selectView(Wrapper<JiudianzhoubianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
