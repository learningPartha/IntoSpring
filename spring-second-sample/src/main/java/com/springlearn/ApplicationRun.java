package com.springlearn;

import com.springlearn.service.CustomerService;
import com.springlearn.service.CustomerServiceImpl;

public class ApplicationRun {

	public static void main(String[] args) {
		
		CustomerService service = new CustomerServiceImpl();
		System.out.println(service.findAll().get(0).getFirstName());
		
	}
	
}
