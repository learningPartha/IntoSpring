package com.springlearn.service;

import java.util.List;

import com.springlearn.model.Customer;
import com.springlearn.repository.CustomerRepository;
import com.springlearn.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
}
