package com.liu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LkjenkinsApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(LkjenkinsApplication.class, args);
		System.err.println("lkjenkins started.......");
		//http://localhost:8081/lkjenkins/hello
	}

}
