package com.getmoney.web.serviceimpls;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getmoney.web.domains.AdminDTO;
import com.getmoney.web.mappers.AdminMapper;
import com.getmoney.web.services.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired AdminMapper adminMapper; 
	
	
	@Override
	public AdminDTO login(AdminDTO param) {
		
	return null;
	}


	@Override
	public int countAdmins() {
		// TODO Auto-generated method stub
		return adminMapper.countAdmin();
	}


		
	
}
