package com.springlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlearn.model.Customer;
import com.springlearn.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	//@Autowired // if we want to directly autowire
	private CustomerRepository customerRepository;
	
	@Autowired //if we want to autowire using constructor injection
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("Using constructor injection");
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

	//@Autowired //if we want to autowire using setter injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Using setter injection");
		this.customerRepository = customerRepository;
	}
	
	
	
}
