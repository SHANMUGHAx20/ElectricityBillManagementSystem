package com.EBMS.sdpproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EBMS.sdpproject.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> 
{
	

}
