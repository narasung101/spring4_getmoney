package com.getmoney.web.services;

import org.springframework.stereotype.Component;

import com.getmoney.web.domains.AdminDTO;
@Component
public interface AdminService  {
	public AdminDTO login(AdminDTO param);
	public int countAdmins();
	
	
	

}
