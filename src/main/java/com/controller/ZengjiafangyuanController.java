package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZengjiafangyuanEntity;
import com.entity.view.ZengjiafangyuanView;

import com.service.ZengjiafangyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 增加房源
 * 后端接口
 * @author 
 * @email 
 * @date 2020-10-16 17:06:21
 */
@RestController
@RequestMapping("/zengjiafangyuan")
public class ZengjiafangyuanController {
    @Autowired
    private ZengjiafangyuanService zengjiafangyuanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZengjiafangyuanEntity zengjiafangyuan, HttpServletRequest request){

        EntityWrapper<ZengjiafangyuanEntity> ew = new EntityWrapper<ZengjiafangyuanEntity>();
    	PageUtils page = zengjiafangyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zengjiafangyuan), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZengjiafangyuanEntity zengjiafangyuan, HttpServletRequest request){
        EntityWrapper<ZengjiafangyuanEntity> ew = new EntityWrapper<ZengjiafangyuanEntity>();
    	PageUtils page = zengjiafangyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zengjiafangyuan), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZengjiafangyuanEntity zengjiafangyuan){
       	EntityWrapper<ZengjiafangyuanEntity> ew = new EntityWrapper<ZengjiafangyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zengjiafangyuan, "zengjiafangyuan")); 
        return R.ok().put("data", zengjiafangyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZengjiafangyuanEntity zengjiafangyuan){
        EntityWrapper< ZengjiafangyuanEntity> ew = new EntityWrapper< ZengjiafangyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zengjiafangyuan, "zengjiafangyuan")); 
		ZengjiafangyuanView zengjiafangyuanView =  zengjiafangyuanService.selectView(ew);
		return R.ok("查询增加房源成功").put("data", zengjiafangyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        ZengjiafangyuanEntity zengjiafangyuan = zengjiafangyuanService.selectById(id);
        return R.ok().put("data", zengjiafangyuan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        ZengjiafangyuanEntity zengjiafangyuan = zengjiafangyuanService.selectById(id);
        return R.ok().put("data", zengjiafangyuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZengjiafangyuanEntity zengjiafangyuan, HttpServletRequest request){
    	zengjiafangyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zengjiafangyuan);

        zengjiafangyuanService.insert(zengjiafangyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZengjiafangyuanEntity zengjiafangyuan, HttpServletRequest request){
    	zengjiafangyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zengjiafangyuan);

        zengjiafangyuanService.insert(zengjiafangyuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZengjiafangyuanEntity zengjiafangyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zengjiafangyuan);
        zengjiafangyuanService.updateById(zengjiafangyuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zengjiafangyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZengjiafangyuanEntity> wrapper = new EntityWrapper<ZengjiafangyuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = zengjiafangyuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
