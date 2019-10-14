package com.web.getmoney.services;

import org.springframework.stereotype.Component;

import com.web.getmoney.domains.EmpDTO;
@Component
public interface EmpService  {
	public EmpDTO login(EmpDTO param);
	
	public boolean join(EmpDTO param);
	
	

}
