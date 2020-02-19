package com.nisum.demo.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nisum.demo.domain.Customer;


public interface CustomerFinder extends CrudRepository<Customer, Long>{
	
	Customer findByLastName(String lastName);

}
