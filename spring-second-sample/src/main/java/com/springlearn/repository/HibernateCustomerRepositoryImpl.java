package com.springlearn.repository;

import java.util.ArrayList;
import java.util.List;

import com.springlearn.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		
		customer.setFirstName("Bryan");
		customer.setLastName("Johanssen");
		customers.add(customer);
		
		return customers;
		
	}
	
}
