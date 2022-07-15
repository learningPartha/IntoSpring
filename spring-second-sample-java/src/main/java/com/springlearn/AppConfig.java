package com.springlearn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

//import com.springlearn.repository.CustomerRepository;
//import com.springlearn.repository.HibernateCustomerRepositoryImpl;
//import com.springlearn.service.CustomerService;
//import com.springlearn.service.CustomerServiceImpl;

@Configuration//mark this as configuration class
@ComponentScan({"com.springlearn"})//to use component scan for autowiring
@PropertySource("application.properties")//to identify application property file
public class AppConfig {
	
	//to create bean for property
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	
	
	/*
	 * @Bean(name="customerRepository")//define spring bean public
	 * CustomerRepository getCustomerRepository() { return new
	 * HibernateCustomerRepositoryImpl(); }
	 *///commented since already using repository annotation
	
	/*
	 * @Bean(name="customerService") public CustomerService getCustomerService() {
	 * //when using constructor injection //CustomerServiceImpl service = new
	 * CustomerServiceImpl(getCustomerRepository()); //when using setter injection
	 * CustomerServiceImpl service = new CustomerServiceImpl();
	 * //service.setCustomerRepository(getCustomerRepository());//commented since
	 * autowiring return service; }
	 *///commented since already using service annotation

}
