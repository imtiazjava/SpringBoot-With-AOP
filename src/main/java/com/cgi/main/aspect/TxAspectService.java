package com.cgi.main.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxAspectService {

	@Pointcut(value = "execution(public void com.cgi.main.dao.EmployeeDAO.saveEmployee())")
	public void pointCut() {}
	
	@Before(value = "pointCut()")
	public void beginTransaction() {
		System.out.println("begin tx");
	}
	
	@AfterReturning(value="pointCut()")
	public void commitTx() {
		System.out.println("commited succussfully....");
	}
	
	@AfterThrowing(value="pointCut()")
	public void rollbackTx() {
		System.out.println("Rollback");
	}
	
	@After(value="pointCut()")
	public void sendData() {
		System.out.println("send the data....");
	}
}
