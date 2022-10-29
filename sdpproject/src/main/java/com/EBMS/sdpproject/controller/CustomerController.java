package com.EBMS.sdpproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EBMS.sdpproject.model.Customer;
import com.EBMS.sdpproject.service.CustomerService;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController 
{
	@Autowired
	private CustomerService customerservice;
	
	@PostMapping("/add")
	public String add(@RequestBody Customer customer)
	{
		customerservice.saveCustomer(customer);
		return "New Customer Login created";
		
	}
	 
	@GetMapping("/viewAll")
	public List<Customer> getAllCustomers()
	{
		return customerservice.getAllCustomers();
	}
	

}
