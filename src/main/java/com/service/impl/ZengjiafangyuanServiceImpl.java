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


import com.dao.ZengjiafangyuanDao;
import com.entity.ZengjiafangyuanEntity;
import com.service.ZengjiafangyuanService;
import com.entity.vo.ZengjiafangyuanVO;
import com.entity.view.ZengjiafangyuanView;

@Service("zengjiafangyuanService")
public class ZengjiafangyuanServiceImpl extends ServiceImpl<ZengjiafangyuanDao, ZengjiafangyuanEntity> implements ZengjiafangyuanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZengjiafangyuanEntity> page = this.selectPage(
                new Query<ZengjiafangyuanEntity>(params).getPage(),
                new EntityWrapper<ZengjiafangyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZengjiafangyuanEntity> wrapper) {
		  Page<ZengjiafangyuanView> page =new Query<ZengjiafangyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZengjiafangyuanVO> selectListVO(Wrapper<ZengjiafangyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZengjiafangyuanVO selectVO(Wrapper<ZengjiafangyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZengjiafangyuanView> selectListView(Wrapper<ZengjiafangyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZengjiafangyuanView selectView(Wrapper<ZengjiafangyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
