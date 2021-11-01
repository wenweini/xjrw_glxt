package com.project.springboot_mybatis_druid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.project.springboot_mybatis_druid.model.UserInfo;
import com.project.springboot_mybatis_druid.model.Wini;
import com.project.springboot_mybatis_druid.service.MinerInfoService;
import com.project.springboot_mybatis_druid.service.UserService;
import com.project.springboot_mybatis_druid.service.WiningService;

@Controller
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserService userService;
	
	@Autowired
	private WiningService winiService;
	
	@Autowired
	private MinerInfoService minerInfoService;
	
	@RequestMapping("/index")
	@ResponseBody
	public String index(){
		return "hello";
	}
	@RequestMapping("/add")
	@ResponseBody
	public String insertUser(UserInfo userInfo){
		if(userInfo == null){
			return "error";
		}
		userService.insertUser(userInfo);
		return "success insert" + userInfo.toString();
	}
	
	@RequestMapping("/search/name/{name}")
	@ResponseBody
	public String searchByname(@PathVariable String name){
		if(name == null){
			return "error";
		}
		UserInfo user = userService.searchByName(name);
		return "success search" + user.toString();
	}
	@RequestMapping("/search/age/{age}")
	@ResponseBody
	public UserInfo[] searchByAge(@PathVariable int age){
		return userService.searchByAge(age);
	}
	@GetMapping("/wining/all")
	@ResponseBody
	public PageInfo<Wini> getAllWining(@RequestParam("pageInfo") String pageInfo){
		
		JSONObject pageJson = JSON.parseObject(pageInfo);
		Wini wini = null;
		if(pageJson!=null){
			Object winiObj = pageJson.get("wini");
			if(winiObj != null) {
				 wini = JSON.parseObject(JSON.toJSON(pageJson.get("wini")).toString(), Wini.class);
			}
			return winiService.selectWiningListPage(Integer.valueOf(pageJson.get("currentPage").toString()),20,wini);
		}
		return winiService.selectWiningListPage(1,20,wini);
		
	}
	
	@GetMapping("/miner/info")
	@ResponseBody
	public String getMinerInfo(){
		
		return JSON.toJSONString(minerInfoService.selectMinerInfoList());
		
	}
	
	public void sendMsg() {
		
	}
}
