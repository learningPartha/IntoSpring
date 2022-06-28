package com.firstmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController { //Create controller for Login method

	@RequestMapping(value="/login") //request maps to login url
	@ResponseBody //send response to show on screen
	public String sayHello() {
		return "Hello World! Dummy";
	}
	
}
