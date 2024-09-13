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

import com.entity.QinzihuodongEntity;
import com.entity.view.QinzihuodongView;

import com.service.QinzihuodongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 亲子活动
 * 后端接口
 * @author 
 * @email 
 * @date 2020-10-16 17:06:22
 */
@RestController
@RequestMapping("/qinzihuodong")
public class QinzihuodongController {
    @Autowired
    private QinzihuodongService qinzihuodongService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QinzihuodongEntity qinzihuodong, HttpServletRequest request){

        EntityWrapper<QinzihuodongEntity> ew = new EntityWrapper<QinzihuodongEntity>();
    	PageUtils page = qinzihuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qinzihuodong), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QinzihuodongEntity qinzihuodong, HttpServletRequest request){
        EntityWrapper<QinzihuodongEntity> ew = new EntityWrapper<QinzihuodongEntity>();
    	PageUtils page = qinzihuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qinzihuodong), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QinzihuodongEntity qinzihuodong){
       	EntityWrapper<QinzihuodongEntity> ew = new EntityWrapper<QinzihuodongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qinzihuodong, "qinzihuodong")); 
        return R.ok().put("data", qinzihuodongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QinzihuodongEntity qinzihuodong){
        EntityWrapper< QinzihuodongEntity> ew = new EntityWrapper< QinzihuodongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qinzihuodong, "qinzihuodong")); 
		QinzihuodongView qinzihuodongView =  qinzihuodongService.selectView(ew);
		return R.ok("查询亲子活动成功").put("data", qinzihuodongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        QinzihuodongEntity qinzihuodong = qinzihuodongService.selectById(id);
        return R.ok().put("data", qinzihuodong);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        QinzihuodongEntity qinzihuodong = qinzihuodongService.selectById(id);
        return R.ok().put("data", qinzihuodong);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        QinzihuodongEntity qinzihuodong = qinzihuodongService.selectById(id);
        if(type.equals("1")) {
        	qinzihuodong.setThumbsupnum(qinzihuodong.getThumbsupnum()+1);
        } else {
        	qinzihuodong.setCrazilynum(qinzihuodong.getCrazilynum()+1);
        }
        qinzihuodongService.updateById(qinzihuodong);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QinzihuodongEntity qinzihuodong, HttpServletRequest request){
    	qinzihuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qinzihuodong);

        qinzihuodongService.insert(qinzihuodong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QinzihuodongEntity qinzihuodong, HttpServletRequest request){
    	qinzihuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qinzihuodong);

        qinzihuodongService.insert(qinzihuodong);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QinzihuodongEntity qinzihuodong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qinzihuodong);
        qinzihuodongService.updateById(qinzihuodong);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qinzihuodongService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<QinzihuodongEntity> wrapper = new EntityWrapper<QinzihuodongEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = qinzihuodongService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
