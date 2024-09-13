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

import com.entity.JiudianzhoubianEntity;
import com.entity.view.JiudianzhoubianView;

import com.service.JiudianzhoubianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 酒店周边
 * 后端接口
 * @author 
 * @email 
 * @date 2020-10-16 17:06:22
 */
@RestController
@RequestMapping("/jiudianzhoubian")
public class JiudianzhoubianController {
    @Autowired
    private JiudianzhoubianService jiudianzhoubianService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiudianzhoubianEntity jiudianzhoubian, HttpServletRequest request){

        EntityWrapper<JiudianzhoubianEntity> ew = new EntityWrapper<JiudianzhoubianEntity>();
    	PageUtils page = jiudianzhoubianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiudianzhoubian), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiudianzhoubianEntity jiudianzhoubian, HttpServletRequest request){
        EntityWrapper<JiudianzhoubianEntity> ew = new EntityWrapper<JiudianzhoubianEntity>();
    	PageUtils page = jiudianzhoubianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiudianzhoubian), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiudianzhoubianEntity jiudianzhoubian){
       	EntityWrapper<JiudianzhoubianEntity> ew = new EntityWrapper<JiudianzhoubianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiudianzhoubian, "jiudianzhoubian")); 
        return R.ok().put("data", jiudianzhoubianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiudianzhoubianEntity jiudianzhoubian){
        EntityWrapper< JiudianzhoubianEntity> ew = new EntityWrapper< JiudianzhoubianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiudianzhoubian, "jiudianzhoubian")); 
		JiudianzhoubianView jiudianzhoubianView =  jiudianzhoubianService.selectView(ew);
		return R.ok("查询酒店周边成功").put("data", jiudianzhoubianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        JiudianzhoubianEntity jiudianzhoubian = jiudianzhoubianService.selectById(id);
        return R.ok().put("data", jiudianzhoubian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        JiudianzhoubianEntity jiudianzhoubian = jiudianzhoubianService.selectById(id);
        return R.ok().put("data", jiudianzhoubian);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        JiudianzhoubianEntity jiudianzhoubian = jiudianzhoubianService.selectById(id);
        if(type.equals("1")) {
        	jiudianzhoubian.setThumbsupnum(jiudianzhoubian.getThumbsupnum()+1);
        } else {
        	jiudianzhoubian.setCrazilynum(jiudianzhoubian.getCrazilynum()+1);
        }
        jiudianzhoubianService.updateById(jiudianzhoubian);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiudianzhoubianEntity jiudianzhoubian, HttpServletRequest request){
    	jiudianzhoubian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiudianzhoubian);

        jiudianzhoubianService.insert(jiudianzhoubian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiudianzhoubianEntity jiudianzhoubian, HttpServletRequest request){
    	jiudianzhoubian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiudianzhoubian);

        jiudianzhoubianService.insert(jiudianzhoubian);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiudianzhoubianEntity jiudianzhoubian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiudianzhoubian);
        jiudianzhoubianService.updateById(jiudianzhoubian);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiudianzhoubianService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JiudianzhoubianEntity> wrapper = new EntityWrapper<JiudianzhoubianEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jiudianzhoubianService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
