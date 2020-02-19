/*package com.nisum.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nisum.model.Order;
import com.nisum.model.Product;
import com.nisum.repository.OrderRepository;
@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	@Override
	public List<Order> listAll() {
		List<Order> orderList=new ArrayList<>();
		orderRepository.findAll().forEach(orderList::add);
		
		return orderList;
	}
 
	@Override
	public Order getById(String orderID) {
	return 	orderRepository.findOne(orderID);
		
	}

	@Override
	public Order create(Order order) {
		orderRepository.save(order);
		return order;
	}

	@Override
	public Order delete(String orderID) {
	return 	orderRepository.findOne(orderID);
	}

	@Override
	public Order updateOrder(String orderId, Order order) {
		
		Order order2= orderRepository.findOne(orderId);
//order2.setCustomerId(order.getCustomerId());
order2.setOrderDate(order.getOrderDate());
order2.setOrderId(order.getOrderId());
order2.setProduct(order.getProduct());
orderRepository.save(order2);

		return order2;
	
	}

}
*/