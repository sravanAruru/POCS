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
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.save(customer);
	}
	
	
	@Override
	public Customer updateCustomer(Customer customer) {
		
		return dao.save(customer);
	}
	
	
	@Override
	public Customer getCustomer(long id) {
		
		return dao.findOne(id);
	}
	
	
	@Override
	public List<Customer> getCustomers() {
		return (List<Customer>) dao.findAll();
	}


	@Override
	public void deleteCustomer(long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		
	}

}
