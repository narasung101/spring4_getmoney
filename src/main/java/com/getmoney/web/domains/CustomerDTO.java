package com.getmoney.web.domains;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
public class CustomerDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String mid, mpw, mname, email, phonenum, birth, tooja, registerDate, tier;
	

}