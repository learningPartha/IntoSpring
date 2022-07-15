package com.springlearn.repository;

import java.util.List;

import com.springlearn.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}