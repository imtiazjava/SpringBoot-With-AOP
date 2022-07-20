package com.cgi.main.dao;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO {

	
	public void saveEmployee() {
		System.out.println("SAVE-EMPLOYEE");
		 throw new RuntimeException("SOME-Exception");
	}
}
