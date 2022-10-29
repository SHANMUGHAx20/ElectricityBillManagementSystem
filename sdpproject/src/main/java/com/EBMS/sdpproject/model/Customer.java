package com.EBMS.sdpproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long mobileno;
	private String email;
	private String password;

	public Customer() {
		super();
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getMobileno() {
		return mobileno;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	

}
