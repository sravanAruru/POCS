package com.nisum.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nisum.model.Customer;
import com.nisum.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	/*@Override
	public List<Customer> listAll() {
		List<Customer> customers=new ArrayList<>();
		 customerRepository.findAll().forEach(customers::add);
		 return customers;
	}

	@Override
	public Customer getById(String customerID) {
		return customerRepository.findOne(customerID);
	}*/

	@Override
	public Customer create(Customer customer) {
		customerRepository.save(customer);
		
		return customer;
	}

	@Override
	public List<Customer> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getById(String customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String customerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer updateCustomer(String customerId, Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public void delete(String customerId) {
		customerRepository.delete(customerId);
	}

	@Override
	public Customer updateCustomer(String customerId, Customer customer) {
	Customer customer2=	customerRepository.findOne(customerId);
	
			//customer2.setCustomerId(customer.getCustomerId());
			customer2.setName(customer.getName());
			customer2.setAddress(customer.getAddress());
			customer2.setPhoneNum(customer.getPhoneNum());
			customer2.setOrder(customer.getOrder());
			customerRepository.save(customer2);
            return customer2 ;
	}
*/
}
