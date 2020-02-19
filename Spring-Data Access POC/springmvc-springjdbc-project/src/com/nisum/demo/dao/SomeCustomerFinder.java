package com.nisum.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nisum.demo.domain.Customer;

@Repository
public class SomeCustomerFinder implements CustomerFinder {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	
	//Querying and populating a single domain object:
	
	public Customer getCustomer(long id) {

	Customer customer = jdbcTemplate.queryForObject(
	        "select firstName, lastName from customerdb where id = ?",
	        new Object[]{id},
	        new RowMapper<Customer>() {
	            public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
	                Customer customer = new Customer();
	                customer.setFirstName(rs.getString("firstName"));
	                customer.setLastName(rs.getString("lastName"));
	                return customer;
	            }
	        });
	return customer;
	
	}
	
	//Querying and populating a number of domain objects:
	
	public List<Customer> getCustomers() {

		List<Customer> customers = jdbcTemplate.query(
		        "select id, firstName, lastName from customerdb",
		        new RowMapper<Customer>() {
		            public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		                Customer customer = new Customer();
		                customer.setId(Long.parseLong(rs.getString("id")));
		                customer.setFirstName(rs.getString("firstName"));
		                customer.setLastName(rs.getString("lastName"));
		                return customer;
		            }
		        });
		return customers;
		
	}

    //If the last two snippets of code actually existed in the same application, 
    //it would make sense to extract them out into a single class.
		
		public List<Customer> findAllCustomers() {
		    return this.jdbcTemplate.query( "select firstName, lastName from customerdb", new CustomerMapper());
		}

		private static final class CustomerMapper implements RowMapper<Customer> {

		    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		        Customer customer = new Customer();
		        customer.setId(Long.parseLong(rs.getString("id")));
		        customer.setFirstName(rs.getString("firstName"));
		        customer.setLastName(rs.getString("lastName"));
		        return customer;
		    }
		}
		
		//inserting with JdbcTemplate
		
		public Customer insertCustomer(Customer customer) {
			
			jdbcTemplate.update(
			        "insert into customerdb (id, firstName, lastName) values (?, ?, ?)", customer.getId(),customer.getFirstName(), customer.getLastName());
			return customer;
		
		}
		
		//updating with JdbcTemplate
		
		public Customer updateCustomer(Customer customer) {
			
			jdbcTemplate.update(
			        "update customerdb set firstName=?,lastName = ? where id = ?",
			        customer.getFirstName(), customer.getLastName(), customer.getId());
			return customer;
		}
		
		//deleting with JdbcTemplate
		
		public void deleteCustomer(long id) {
			
			jdbcTemplate.update("delete from customerdb where id = ?",Long.valueOf(id));

		}
		
		
}
