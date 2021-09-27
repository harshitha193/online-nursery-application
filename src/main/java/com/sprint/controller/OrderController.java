package com.sprint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.sprint.entities.Order;
import com.sprint.service.IOrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	IOrderService orderService;
	
	@GetMapping
	public List<Order> getAllOrders()
	{
		return orderService.viewAllOrders();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Order addOrder(@RequestBody Order order)
	{
		return orderService.addOrder(order);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteOrder(@PathVariable int orderId)
	{
		orderService.deleteOrder(orderId);
	}
	
	@PutMapping("/{update}")
	public Order updateOrder(@RequestBody Order order)
	{
		return orderService.updateOrder(order);
	}
	
	
	
	
}


