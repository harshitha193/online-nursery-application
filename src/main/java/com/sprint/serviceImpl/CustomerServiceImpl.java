package com.sprint.serviceImpl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.service.ICustomerService;
import com.sprint.dao.CustomerRepository;
import com.sprint.entities.Customer;
@Service
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	private CustomerRepository repository;
	
	@Override
	public Customer addCustomer(Customer customer) {
		return repository.save(customer);
	}
	
	@Override
	public Customer updateCustomer(Customer tenant) {
		Customer cust = repository.findById(tenant.getCustomerId()).orElseThrow(
				()->new EntityNotFoundException("No customer found for the given Id"));
		tenant.setCustomerId(cust.getCustomerId());
		return repository.save(cust);
	}
	
	public void deleteCustomerById(int id) {
		repository.deleteById(id);
	}
	
	@Override
	public Customer viewCustomer(int customerId) {
		return  repository.findById(customerId).get();
		
	}
	
	@Override
	public List<Customer> viewAllCustomers(){
		return null;
	}

	@Override
	public void deleteCustomer(Customer tenant) {
		// TODO Auto-generated method stub
		 repository.delete(tenant);
	}

	@Override
	public Customer validateCustomer(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Customer getCustomerCount(int customerId) {
		return repository.findById(customerId).get();
	}
	
	
}