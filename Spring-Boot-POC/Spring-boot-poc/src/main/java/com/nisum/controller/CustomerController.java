package com.nisum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.model.Customer;
import com.nisum.repository.CustomerRepository;
import com.nisum.service.CustomerService;
 
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	

	//create
	@RequestMapping(value="/createCust",method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Customer createCust(@RequestBody Customer customer)
	{
		return customerService.create(customer);
	}
	//read
	@RequestMapping
	public List<Customer> readCustomers()
	{
	return	customerService.listAll();
	}

	//update
	@RequestMapping( value="/{customerId}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Customer updateCustomer(@PathVariable String customerId ,@RequestBody Customer customer)
	{
	
		return customerService.updateCustomer(customerId, customer);
	}

	//delete
	@RequestMapping(value="{customerId}",method=RequestMethod.DELETE)

	public void deleteCustomer(@PathVariable String customerId)
	{
		customerService.delete(customerId);
	}

}
