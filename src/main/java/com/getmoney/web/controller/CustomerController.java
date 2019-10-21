package com.getmoney.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.getmoney.web.domains.CustomerDTO;
import com.getmoney.web.serviceimpls.CustomerServiceImpl;
import com.getmoney.web.services.CustomerService;


@Controller
@RequestMapping("/customer/*")
public class CustomerController {
	private static final Logger Logger = LoggerFactory.getLogger(CustomerController.class);
	@Autowired Map<String, Object> map;
	@Autowired CustomerDTO cust;
	@Autowired CustomerServiceImpl custservice;
	
	@PostMapping("/join")
	public @ResponseBody Map<?,?> join(@RequestBody CustomerDTO param){
		Logger.info("ajax가 보낸 아이디와 비번{}", param.getMid()+","+param.getMpw());
		cust.setMid(param.getMid());
		cust.setMpw(param.getMpw());
		cust.setMname(param.getMname());
		custservice.Join(cust);
		
		HashMap<String,String> map = new HashMap<>();
		map.put("mid", param.getMid());
		map.put("mpw", param.getMpw());
		Logger.info("map에  담긴 아이디와 비번{}", map.get("mid")+","+map.get("mpw"));
	    return map;
	}	
	    @PostMapping("/login")
		public @ResponseBody CustomerDTO login(@RequestBody CustomerDTO param){
			Logger.info("ajax가 보낸 아이디와 비번{}", param.getMid()+","+param.getMpw());
			cust.setMid(param.getMid());
			cust.setMpw(param.getMpw());
			cust = custservice.login(cust);
			Logger.info("user에  담긴 아이디와 비번{}", cust.toString());
		    return cust;
	    
	}
}
