package com.web.getmoney.daos;

import com.web.getmoney.domains.EmpBean;

public interface EmpDao {
	
	public boolean insertEmpBean(EmpBean param);
	
	public EmpBean selectbyLoginData(EmpBean param);
	
	
}
