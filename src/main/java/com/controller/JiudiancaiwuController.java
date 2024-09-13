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

import com.entity.JiudiancaiwuEntity;
import com.entity.view.JiudiancaiwuView;

import com.service.JiudiancaiwuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 酒店财务
 * 后端接口
 * @author 
 * @email 
 * @date 2020-10-16 17:06:23
 */
@RestController
@RequestMapping("/jiudiancaiwu")
public class JiudiancaiwuController {
    @Autowired
    private JiudiancaiwuService jiudiancaiwuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiudiancaiwuEntity jiudiancaiwu, HttpServletRequest request){

        EntityWrapper<JiudiancaiwuEntity> ew = new EntityWrapper<JiudiancaiwuEntity>();
    	PageUtils page = jiudiancaiwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiudiancaiwu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiudiancaiwuEntity jiudiancaiwu, HttpServletRequest request){
        EntityWrapper<JiudiancaiwuEntity> ew = new EntityWrapper<JiudiancaiwuEntity>();
    	PageUtils page = jiudiancaiwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiudiancaiwu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiudiancaiwuEntity jiudiancaiwu){
       	EntityWrapper<JiudiancaiwuEntity> ew = new EntityWrapper<JiudiancaiwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiudiancaiwu, "jiudiancaiwu")); 
        return R.ok().put("data", jiudiancaiwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiudiancaiwuEntity jiudiancaiwu){
        EntityWrapper< JiudiancaiwuEntity> ew = new EntityWrapper< JiudiancaiwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiudiancaiwu, "jiudiancaiwu")); 
		JiudiancaiwuView jiudiancaiwuView =  jiudiancaiwuService.selectView(ew);
		return R.ok("查询酒店财务成功").put("data", jiudiancaiwuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        JiudiancaiwuEntity jiudiancaiwu = jiudiancaiwuService.selectById(id);
        return R.ok().put("data", jiudiancaiwu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        JiudiancaiwuEntity jiudiancaiwu = jiudiancaiwuService.selectById(id);
        return R.ok().put("data", jiudiancaiwu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiudiancaiwuEntity jiudiancaiwu, HttpServletRequest request){
    	jiudiancaiwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiudiancaiwu);

        jiudiancaiwuService.insert(jiudiancaiwu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiudiancaiwuEntity jiudiancaiwu, HttpServletRequest request){
    	jiudiancaiwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiudiancaiwu);

        jiudiancaiwuService.insert(jiudiancaiwu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiudiancaiwuEntity jiudiancaiwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiudiancaiwu);
        jiudiancaiwuService.updateById(jiudiancaiwu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiudiancaiwuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JiudiancaiwuEntity> wrapper = new EntityWrapper<JiudiancaiwuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jiudiancaiwuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
