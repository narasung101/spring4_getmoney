package com.getmoney.web.services;

import org.springframework.stereotype.Component;

import com.getmoney.web.domains.AdminDTO;
@Component
public interface CustomerService  {
	public AdminDTO login(AdminDTO param);
	
	public boolean join(AdminDTO param);
	
	
	

}
