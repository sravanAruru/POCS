package com.nisum.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nisum.demo.domain.Customer;


public interface CustomerService {

	Customer addCustomer(Customer customer);

	Customer updateCustomer(Customer customer);

	Customer getCustomer(long id);

	List<Customer> getCustomers();

	void deleteCustomer(long id);

}