package com.example.wdbecomerce.Product.ProductController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wdbecomerce.Product.Model.Product;
import com.example.wdbecomerce.Product.ProductRepo.ProductRepo;

@RestController
@RequestMapping("api/product")
public class ProductController {
	
	@Autowired
	ProductRepo productRepo;
	
	@GetMapping("/allproduct") 
	public ArrayList<Product> getAllProduct(){
		ArrayList<Product> result =(ArrayList<Product>) productRepo.findAll();
		return  result;
	}
}
