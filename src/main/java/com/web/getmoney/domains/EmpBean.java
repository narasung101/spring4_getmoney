package com.web.getmoney.domains;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmpBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String empno, ename, job, mgr, hiredate, sal, comm, deptno;

}
