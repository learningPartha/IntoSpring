package com.springlearn.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.springlearn.model.Customer;

@Repository("customerRespository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUserName}")//autowire property value
	private String dbUserName;

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
