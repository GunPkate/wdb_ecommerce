package com.example.wdbecomerce.Product.ProductController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wdbecomerce.Product.Model.ProductVariant;
import com.example.wdbecomerce.Product.ProductRepo.ProductVariantRepo;

@RestController
@RequestMapping("api/productvariant")
public class ProductVariantController {
	@Autowired ProductVariantRepo productVariantRepo;
	@GetMapping("/")
	public ArrayList<ProductVariant> getAllVariant() {
		ArrayList<ProductVariant> result = (ArrayList<ProductVariant>) productVariantRepo.findAll();
		return  result;
	}
}
