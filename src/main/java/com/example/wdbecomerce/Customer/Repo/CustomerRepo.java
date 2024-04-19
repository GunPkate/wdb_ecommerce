package com.example.wdbecomerce.Customer.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.wdbecomerce.Customer.Model.Customer;

public interface CustomerRepo extends CrudRepository<Customer,String> {
	
}
