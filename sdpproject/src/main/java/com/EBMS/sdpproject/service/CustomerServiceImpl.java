package com.EBMS.sdpproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EBMS.sdpproject.model.Customer;
import com.EBMS.sdpproject.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService
{

	@Autowired
	private CustomerRepository customerrepository;
	
	
	@Override
	public Customer saveCustomer(Customer customer) {
		
		return customerrepository.save(customer);
	}


	@Override
	public List<Customer> getAllCustomers() {
		
		return customerrepository.findAll();
	}

	

}
