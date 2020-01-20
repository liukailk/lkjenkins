package com.liu.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class HelloController {

	@RequestMapping(value = {"","/hello"})
	@ResponseBody
	public String hello() {  
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return "hello jenkins 工程2" + sdf.format(new Date());
	}
}
