package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Kehu;
import com.accp.service.kehuservice;

@Controller
public class kehucontroller {
	
	@Autowired
	kehuservice ser;
	
	@RequestMapping("/toindex")
	public String toBill() {
		return "index";
	}
	
	@RequestMapping("/find")
	@ResponseBody
	public Kehu find(Integer userid) {
		return ser.find(userid);
	}
	
	
//	@RequestMapping("/create")
//	@ResponseBody
//	public int create(@RequestBody Kehu k) {
//		int count = ser.create(k);
//		return count;
//	}
	@RequestMapping("/create")
	@ResponseBody
	public int insert(Kehu k) {
		return ser.insert(k);
	}
}
