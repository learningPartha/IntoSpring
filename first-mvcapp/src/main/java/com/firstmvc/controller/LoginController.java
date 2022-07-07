package com.firstmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.firstmvc.service.LoginService;

@Controller
public class LoginController { //Create controller for Login method
	
	//Set Login service
	@Autowired
	LoginService service;

	@RequestMapping(value="/login" , method =RequestMethod.GET) //request maps to login url
	//@ResponseBody //send response to show on screen
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login" , method =RequestMethod.POST) //request maps to login url
	//@ResponseBody //send response to show on screen
	public String handleLoginRequest(@RequestParam String name, @RequestParam String password,
			ModelMap model) {
		
		if(!service.validateUser(name, password)) { //validate if user is valid
			model.put("errorMessage","Invalid Credentials"); //put error if it is invalid
			return "login";
		}
		//System.out.println(name);
		model.put("name", name);//Put request parameter passed into Model to view in View
		model.put("password", password);
		return "welcome";
		
	}
	
}
