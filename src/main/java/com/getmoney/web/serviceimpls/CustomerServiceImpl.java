package com.getmoney.web.serviceimpls;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.getmoney.web.domains.CustomerDTO;
import com.getmoney.web.mappers.CustomerMapper;
import com.getmoney.web.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired CustomerMapper custMapper;

	@Override
	public CustomerDTO login(CustomerDTO param) {
		
		return custMapper.slectByIdPw(param);
	}

	@Override
	public void Join(CustomerDTO param) {
		custMapper.insertIntoCusData(param);
				
	}
		

	}

		

