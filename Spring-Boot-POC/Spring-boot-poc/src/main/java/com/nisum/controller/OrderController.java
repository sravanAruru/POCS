/*package com.nisum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nisum.model.Order;
import com.nisum.model.Product;
import com.nisum.service.OrderService;
import com.nisum.service.ProductService;

@RestController
@RequestMapping("/api/order")
public class OrderController {

	@Autowired	
	private 	OrderService orderService;
	
	


	//creates
	@RequestMapping(value="/createOrder",method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
		public void createOrder(@RequestBody Order order) 
		{
			

		 orderService.create(order);
}
	

	//read
	@RequestMapping
	public List<Order> readOrders()
	{
	return	orderService.listAll();
	}

	//update
	@RequestMapping( value="/{orderId}",method=RequestMethod.GET)
	public ResponseEntity<List<Order>> updateOrders(@PathVariable String orderId)
	{
		try {
			System.err.println(""+new ObjectMapper().writeValueAsString(orderService.listAll()));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return  new ResponseEntity<List<Order>>(orderService.listAll(),HttpStatus.OK);
		
	}
//update order
	@RequestMapping(value="/{orderId}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Order> updateOrder(@PathVariable String orderId,@RequestBody Order order)
	{
		
	 order=	orderService.getById(orderId);
	
	if(order==null)
	{
		return ResponseEntity.notFound().build();
				
	}

		 orderService.updateOrder(orderId, order);
		 return ResponseEntity.ok(order);
	}
	
	
	
	//delete
	@RequestMapping(value="{orderId}",method=RequestMethod.DELETE)
    
	public ResponseEntity<Order> deleteOrder(@PathVariable String orderId)
	{
	Order order=	orderService.delete(orderId);
	if(order==null)
	{
		return ResponseEntity.notFound().build();
	}
	return ResponseEntity.ok().build();
	
	}
}
*/