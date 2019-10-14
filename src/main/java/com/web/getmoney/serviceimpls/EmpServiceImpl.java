package com.web.getmoney.serviceimpls;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.getmoney.domains.EmpDTO;
import com.web.getmoney.mappers.EmpMapper;
import com.web.getmoney.services.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired EmpMapper mapper; 
	
	
	@Override
	public EmpDTO login(EmpDTO param) {
		
	return null;
	}

	@Override
	public boolean join(EmpDTO param) {
		System.out.println("서비스 도착");
		return false;
	}

}
