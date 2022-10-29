package com.EBMS.sdpproject.service;

import java.util.List;

import com.EBMS.sdpproject.model.Customer;





public interface CustomerService 
{
	public Customer saveCustomer(Customer customer);
	public List<Customer> getAllCustomers();

}
