package com.web.getmoney.mappers;

import org.springframework.stereotype.Repository;

import com.web.getmoney.domains.EmpDTO;
@Repository
public interface EmpMapper {
	
	public boolean insertEmpDTO(EmpDTO param);
	
	public EmpDTO selectbyLoginData(EmpDTO param);
	
	
}
