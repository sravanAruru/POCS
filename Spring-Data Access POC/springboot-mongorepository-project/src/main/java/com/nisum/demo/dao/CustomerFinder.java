package com.nisum.demo.dao;


import org.springframework.data.mongodb.repository.MongoRepository;


import com.nisum.demo.domain.Customer;


public interface CustomerFinder extends MongoRepository<Customer, Long>{
	
	Customer findByLastName(String lastName);

}
