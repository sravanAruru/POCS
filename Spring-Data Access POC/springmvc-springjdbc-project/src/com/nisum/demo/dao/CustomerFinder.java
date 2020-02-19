package com.nisum.demo.dao;

import java.util.List;


import com.nisum.demo.domain.Customer;


public interface CustomerFinder {
	
	public Customer getCustomer(long id);
	
	public List<Customer> getCustomers();
	
	public List<Customer> findAllCustomers();
	
	public Customer insertCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer);
	
	public void deleteCustomer(long id);

}
