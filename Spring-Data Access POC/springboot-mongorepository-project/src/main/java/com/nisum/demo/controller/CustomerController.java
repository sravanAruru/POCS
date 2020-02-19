package com.nisum.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.demo.domain.Customer;
import com.nisum.demo.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@RequestMapping(value="/", method=RequestMethod.GET) 
	public String getHome() {
		return "home";
	}
	
	
	@RequestMapping(value="/addCustomer", method=RequestMethod.POST) 
	public ModelAndView addCustomer(@ModelAttribute Customer customer) {
		
		Customer c = service.addCustomer(customer);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("custDetails");
		mav.addObject(c);
		return mav;
		
	}
	
	@RequestMapping(value="/addCustomerForm", method=RequestMethod.GET)
	public ModelAndView addCustomerForm() {
		Customer c = new Customer();
		ModelAndView mav = new ModelAndView();
		mav.addObject(c);
		mav.setViewName("addCustomerForm");
		return mav;
	}
	
	@RequestMapping(value="/updateCustomerForm", method=RequestMethod.GET)
	public ModelAndView updateCustomerForm(HttpServletRequest request, HttpServletResponse response) {
		
		Customer c = new Customer();
		c.setId(Long.parseLong(request.getParameter("id")));
		c.setFirstName(request.getParameter("firstName"));
		c.setLastName(request.getParameter("lastName"));
		ModelAndView mav = new ModelAndView();
		mav.addObject(c);
		mav.setViewName("updateCustomerForm");
		return mav;
	}
	
	@RequestMapping(value="/updateCustomer", method=RequestMethod.POST) 
	public ModelAndView updateCustomer(@ModelAttribute Customer customer) {
		
		Customer c = service.updateCustomer(customer);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("custDetails");
		mav.addObject(c);
		return mav;
			
	}
	
	@RequestMapping(value="/getCustomers", method=RequestMethod.GET) 
	public ModelAndView getCustomers() {
		ModelAndView mav = new ModelAndView();
		List<Customer> customers = service.getCustomers();
		mav.addObject("customers",customers);
		mav.setViewName("customersList");
		return mav;
		
		
	}
	
	@RequestMapping(value="/deleteCustomer", method=RequestMethod.GET) 
	public ModelAndView deleteCustomer(@RequestParam("id") long id) {
		
		 service.deleteCustomer(id);
		 
		return getCustomers();
		
	}
	

}
