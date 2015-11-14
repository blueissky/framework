package com.spring.controller;

import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class MyController {
	@RequestMapping("/mvc")
	public String sss() {//http://localhost:8080/spring-mvc-demo/hello/mvc
		
		return "home";//返回的JSP页面名称
	}
}





















