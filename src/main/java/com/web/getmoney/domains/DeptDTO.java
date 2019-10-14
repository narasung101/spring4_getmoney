package com.web.getmoney.domains;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
public class DeptDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String deptno, dname, loc;   
}
