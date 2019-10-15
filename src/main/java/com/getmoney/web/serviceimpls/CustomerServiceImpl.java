package com.getmoney.web.serviceimpls;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getmoney.web.domains.AdminDTO;
import com.getmoney.web.mappers.AdminMapper;
import com.getmoney.web.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired AdminMapper mapper; 
	
	
	@Override
	public AdminDTO login(AdminDTO param) {
		
	return null;
	}

	@Override
	public boolean join(AdminDTO param) {
		System.out.println("서비스 도착");
		return false;
	}

	
	
}
