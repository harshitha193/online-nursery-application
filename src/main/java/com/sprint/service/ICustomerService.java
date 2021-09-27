package com.sprint.service;

import java.util.List;

import com.sprint.entities.Customer;

public interface ICustomerService {
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer tenant);
	public void deleteCustomer(Customer tenant);
	public Customer viewCustomer(int customerId);
	public Customer validateCustomer(String userName, String password);
	public List<Customer> viewAllCustomers();
	public Customer getCustomerCount(int customerId);
	


}
