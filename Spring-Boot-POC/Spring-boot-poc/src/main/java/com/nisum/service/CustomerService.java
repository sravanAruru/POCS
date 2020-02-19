package com.nisum.service;

import java.util.List;

import com.nisum.model.Customer;

public interface CustomerService {
	
	List<Customer> listAll();

	Customer getById(String customerID);

	Customer create(Customer customer);

    void delete(String customerId);

	Customer updateCustomer(String customerId, Customer customer);
	
}
