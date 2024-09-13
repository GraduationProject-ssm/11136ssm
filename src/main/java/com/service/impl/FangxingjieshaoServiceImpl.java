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


import com.dao.FangxingjieshaoDao;
import com.entity.FangxingjieshaoEntity;
import com.service.FangxingjieshaoService;
import com.entity.vo.FangxingjieshaoVO;
import com.entity.view.FangxingjieshaoView;

@Service("fangxingjieshaoService")
public class FangxingjieshaoServiceImpl extends ServiceImpl<FangxingjieshaoDao, FangxingjieshaoEntity> implements FangxingjieshaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangxingjieshaoEntity> page = this.selectPage(
                new Query<FangxingjieshaoEntity>(params).getPage(),
                new EntityWrapper<FangxingjieshaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangxingjieshaoEntity> wrapper) {
		  Page<FangxingjieshaoView> page =new Query<FangxingjieshaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangxingjieshaoVO> selectListVO(Wrapper<FangxingjieshaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangxingjieshaoVO selectVO(Wrapper<FangxingjieshaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangxingjieshaoView> selectListView(Wrapper<FangxingjieshaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangxingjieshaoView selectView(Wrapper<FangxingjieshaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
