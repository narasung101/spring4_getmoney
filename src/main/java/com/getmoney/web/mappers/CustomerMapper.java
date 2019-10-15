package com.getmoney.web.mappers;

import org.springframework.stereotype.Repository;

import com.getmoney.web.domains.AdminDTO;
@Repository
public interface CustomerMapper {
	
	public boolean insertEmpDTO(AdminDTO param);
	public int countEmp();
	public AdminDTO selectbyLoginData(AdminDTO param);
	
	
}
