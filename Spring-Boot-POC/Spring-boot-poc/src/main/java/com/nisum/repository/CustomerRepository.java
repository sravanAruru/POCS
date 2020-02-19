package com.nisum.repository;


import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.nisum.model.Customer;
@Repository
public interface CustomerRepository extends CassandraRepository<Customer>{
	


}
