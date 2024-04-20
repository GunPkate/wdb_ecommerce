package com.example.wdbecomerce.Product.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@Column
	private String id;
	
	@Column
	private String name;
	
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.MERGE)
	@JsonManagedReference
	private List<ProductDetail> productDetail;
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.MERGE)
	@JsonManagedReference
	private List<ProductVariant> productVariant;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	Product() {
		
	}
	
	Product(String id, String name) {
		this.id = id;
		this.name = name;
	}
}

