package com.sprint.service;

import java.util.List;
import com.sprint.entities.Order;

public interface IOrderService {
	public Order addOrder(Order order);
	   public Order updateOrder(Order order);
	   public void deleteOrder(int  orderId);
	   public Order viewOrder(int  orderId);
	   public List<Order> viewAllOrders();
	   

}
