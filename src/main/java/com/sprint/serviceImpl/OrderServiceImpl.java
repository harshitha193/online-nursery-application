package com.sprint.serviceImpl;
import java.util.List;


import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.dao.IOrderRepository;
import com.sprint.entities.Order;
import com.sprint.service.IOrderService;
@Service
public class OrderServiceImpl implements IOrderService {
	@Autowired
	IOrderRepository repository;

	@Override
	public Order addOrder(Order order) {
		return repository.save(order);
	}

	@Override
	public Order updateOrder(Order order) {
		Order order1 = repository.findById(order.getBookingOrderId())
				.orElseThrow(() -> new EntityNotFoundException("No Order Found for the given Id"));
		order.setBookingOrderId(order.getBookingOrderId());
		return repository.save(order1);
	}

	@Override
	public void deleteOrder(int orderId) {
		 repository.deleteById(orderId);

	}

	@Override
	public Order viewOrder(int orderId) {
		return  repository.findById(orderId).get();
		
	}

	@Override
	public List<Order> viewAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
