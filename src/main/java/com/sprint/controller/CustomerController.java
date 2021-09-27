package com.sprint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.sprint.entities.Customer;
import com.sprint.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	ICustomerService customerService;
	

	@GetMapping
	public List<Customer> getAllCustomers()
	{
		return customerService.viewAllCustomers();
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Customer addCustomer(@RequestBody Customer cust)
	{
		return customerService.addCustomer(cust);
	}
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteCustomer(@PathVariable Customer tenant) {
		customerService.deleteCustomer(tenant);
	}
	@PutMapping("/{update}")
	public Customer updateCustomer(@RequestBody Customer cust)
	{
		return customerService.updateCustomer(cust);
	}
	
	@GetMapping("/name/{Count}")
	public Customer getCustomerCount(int customerId)
	{
		return customerService.getCustomerCount(customerId);
	}

}