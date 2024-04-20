package com.example.wdbecomerce.Product.ProductController;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.wdbecomerce.Product.Model.Product;
import com.example.wdbecomerce.Product.Model.ProductDetail;
import com.example.wdbecomerce.Product.ProductRepo.ProductDetailRepo;

@RestController
@RequestMapping("api/productdetail")
public class ProductDetailController {
	@Autowired
	ProductDetailRepo productDetailRepo;
	
	@GetMapping("/")
	public ArrayList<ProductDetail> getProductDetail(){
		ArrayList<ProductDetail>  result   = (ArrayList<ProductDetail>) productDetailRepo.findAll();
		return result;
	}
	
	@RequestMapping(path ="/{id}", method = RequestMethod.GET)
	public Optional<ProductDetail> getProductDetailById(@PathVariable("id") String id){
		Optional<ProductDetail>  result   = (Optional<ProductDetail>) productDetailRepo.findById(id);
		return result;
	}
}
