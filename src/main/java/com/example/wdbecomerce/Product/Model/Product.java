package com.example.wdbecomerce.Product.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@Column
	private String id;
	
	@Column
	private String name;
	
	@Column
	private String skucode;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getSkuCode() {
		return skucode;
	}

	public void setSkuCode(String skuCode) {
		this.skucode = skuCode;
	}
	
	Product() {
		
	}
	
	Product(String id, String name,String skuCode) {
		this.id = id;
		this.name = name;
		this.skucode = skuCode;
	}
}

