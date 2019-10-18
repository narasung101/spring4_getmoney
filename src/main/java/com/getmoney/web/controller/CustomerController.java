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


@Controller
@RequestMapping("/customer/*")
public class CustomerController {
	private static final Logger Logger = LoggerFactory.getLogger(CustomerController.class);
		
	@PostMapping("/join")
	public @ResponseBody Map<?,?> join(@RequestBody CustomerDTO cus){
		Logger.info("ajax가 보낸 아이디와 비번{}", cus.getMid()+","+cus.getMpw());
		HashMap<String,String> map = new HashMap<>();

		map.put("mid", cus.getMid());
		map.put("mpw", cus.getMpw());
		Logger.info("map에  담긴 아이디와 비번{}", map.get("mid")+","+map.get("mpw"));
	    return map;
	}


	    @PostMapping("/login")
		public @ResponseBody Map<?,?> login(@RequestBody CustomerDTO cus){
			Logger.info("ajax가 보낸 아이디와 비번{}", cus.getMid()+","+cus.getMpw());
			HashMap<String,String> map = new HashMap<>();

			map.put("mid", cus.getMid());
			map.put("mpw", cus.getMpw());
			Logger.info("map에  담긴 아이디와 비번{}", map.get("mid")+","+map.get("mpw"));
		    return map;
	    
	}

}
