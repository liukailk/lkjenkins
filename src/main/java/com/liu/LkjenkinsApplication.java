package com.liu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LkjenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LkjenkinsApplication.class, args);
		System.err.println("lkjenkins started.......");
		//http://localhost:8081/lkjenkins/hello
	}

}
