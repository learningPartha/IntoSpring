package com.springlearn.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.springlearn.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUserName}")//placeholder for property values
	private String dbUserName;

	/*
	 * public void setDbUserName(String dbUserName) { this.dbUserName = dbUserName;
	 * }
	 *///if not using xml config for setting

	public List<Customer> findAll(){
		
		System.out.println(dbUserName);
		
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		
		customer.setFirstName("Bryan");
		customer.setLastName("Johanssen");
		customers.add(customer);
		
		return customers;
		
	}
	
}
