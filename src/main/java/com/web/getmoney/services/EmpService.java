package com.web.getmoney.services;

import com.web.getmoney.domains.EmpBean;

public interface EmpService  {
	public EmpBean login(EmpBean param);
	
	public boolean join(EmpBean param);
	
	

}
