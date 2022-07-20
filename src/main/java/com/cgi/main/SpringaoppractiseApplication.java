package com.cgi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication //@Component
@EnableAspectJAutoProxy //It is scanning @Aspect
public class SpringaoppractiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringaoppractiseApplication.class, args);
	}

}
