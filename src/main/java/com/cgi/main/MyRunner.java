package com.cgi.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cgi.main.dao.EmployeeDAO;
@Component
public class MyRunner implements CommandLineRunner{

	@Autowired
	private EmployeeDAO edao;
	
	@Override
	public void run(String... args) throws Exception {
		    
			this.edao.saveEmployee();
			
			System.out.println("Inside the run method");
	}

}
