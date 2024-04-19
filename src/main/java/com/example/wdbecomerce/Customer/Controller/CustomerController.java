package com.example.wdbecomerce.Customer.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wdbecomerce.Customer.Model.Customer;
import com.example.wdbecomerce.Customer.Repo.CustomerRepo;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
	
	@Autowired
	CustomerRepo customerRepo;
	
	@GetMapping("/allcustomer") 
	public ArrayList<Customer> getAllCustomer(){
		ArrayList<Customer> result =(ArrayList<Customer>) customerRepo.findAll();
		return  result;
	}
}
