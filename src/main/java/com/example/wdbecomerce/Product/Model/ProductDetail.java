package com.example.wdbecomerce.Product.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "product_detail")
public class ProductDetail {
	@Id
	@Column
	private String id;
	
	@Column
	private float price;
	
	@Column
	private float promotion_price;
	
	@Column
	private String description;
	
	@Column
	private float rating;
	
	@ManyToOne
	@JoinColumn(name="product_code")
	@JsonBackReference
	private Product product;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPromotion_price() {
		return promotion_price;
	}

	public void setPromotion_price(float promotion_price) {
		this.promotion_price = promotion_price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
