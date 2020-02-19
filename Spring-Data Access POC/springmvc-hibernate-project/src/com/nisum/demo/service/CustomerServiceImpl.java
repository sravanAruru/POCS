package com.nisum.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nisum.demo.dao.CustomerFinder;
import com.nisum.demo.domain.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerFinder dao;
	
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.insertCustomer(customer);
	}
	
	
	
	public Customer updateCustomer(Customer customer) {
		
		return dao.updateCustomer(customer);
	}
	
	
	
	public Customer getCustomer(long id) {
		
		return dao.getCustomer(id);
	}
	
	
	
	public List<Customer> getCustomers() {
		return dao.getCustomers();
	}


	
	public void deleteCustomer(long id) {
		// TODO Auto-generated method stub
		dao.deleteCustomer(id);
		
	}
}
