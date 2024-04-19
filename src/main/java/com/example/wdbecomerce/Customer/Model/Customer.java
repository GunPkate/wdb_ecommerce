package com.example.wdbecomerce.Customer.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;

@Entity
@Table(name = "customer")
//@query (findAll(),"Select c from customer")
public class Customer {
	@Id
	@Column
	private String id;
	
	@Column 
	private String name;
	
	@Column 
	private String email;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Customer() {}
	
	public Customer(String id,String name ,String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
}
