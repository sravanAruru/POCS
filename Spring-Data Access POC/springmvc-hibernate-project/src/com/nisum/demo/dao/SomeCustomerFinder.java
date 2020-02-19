package com.nisum.demo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nisum.demo.domain.Customer;

@Repository
public class SomeCustomerFinder implements CustomerFinder {
	
	@Autowired
    private SessionFactory sf;
	
	
	//Querying and populating a single domain object:
	
	public Customer getCustomer(long id) {
		
	Session session = sf.openSession();
	return (Customer) session.get(Customer.class, id);
	
	}
	
	//Querying and populating a number of domain objects:
	
	@SuppressWarnings("unchecked")
	public List<Customer> getCustomers() {
		Session session = sf.openSession();
		return session.createQuery("from Customer").list();

	}
	
		//inserting with Hibernate
		
		public Customer insertCustomer(Customer customer) {
			Session session = sf.openSession();
			session.save(customer);
			return customer;
		
		}
		
		//updating with  with Hibernate
		
		public Customer updateCustomer(Customer customer) {
			System.out.println("id " + customer.getId() + " first name " + customer.getFirstName() + " last name " + customer.getLastName());
			Session session = sf.openSession();
			String sql = "update Customer set firstName=:firstName, lastName=:lastName where id=:id";
			Query q = session.createQuery(sql).setParameter("firstName",customer.getFirstName()).setParameter("lastName", customer.getLastName()).setParameter("id", customer.getId());
			q.executeUpdate();
			return customer;
		}
		
		//deleting with Hibernate
		
		public void deleteCustomer(long id) {
			Session session = sf.openSession();
			String sql = "delete from Customer where id=:id";
			Query q = session.createQuery(sql).setParameter("id", id);
			q.executeUpdate();
		}

		
}
