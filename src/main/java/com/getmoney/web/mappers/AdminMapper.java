package com.getmoney.web.mappers;

import org.springframework.stereotype.Repository;

import com.getmoney.web.domains.AdminDTO;
@Repository
public interface AdminMapper {
	
	public boolean insertEmpDTO(AdminDTO param);
	public int countAdmin();
	public AdminDTO selectbyLoginData(AdminDTO param);
	
	
}
