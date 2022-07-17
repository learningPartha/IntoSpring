package com.springlearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springlearn.service.CustomerService;
import com.springlearn.service.CustomerServiceImpl;

public class ApplicationRun {

	public static void main(String[] args) {
		
		//CustomerService service = new CustomerServiceImpl();
		//create application context based on xml
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from xml
		CustomerService service = appContext.getBean("customerService",CustomerService.class);
		
		System.out.println(service.findAll().get(0).getFirstName());
		
	}
	
}
