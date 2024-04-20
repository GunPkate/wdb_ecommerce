package com.example.wdbecomerce.Product.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "product_variant")
public class ProductVariant {
	@Id
	@Column
	private String id;
	
	@Column
	private String color;
	
	@Column
	private String color_code;
	
	@Column
	private String size;
	
	@Column
	private Integer remains;
	
	@ManyToOne
	@JoinColumn(name="product_code")
	@JsonBackReference
	private Product product;

	public ProductVariant() {}
	
	public ProductVariant(String id, String color, String colorcode, String size, Integer remains) {
		id = id;
		color = color;
		colorcode = colorcode;
		size = size;
		remains = remains;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor_code() {
		return color_code;
	}

	public void setColor_code(String color_code) {
		this.color_code = color_code;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getRemains() {
		return remains;
	}

	public void setRemains(Integer remains) {
		this.remains = remains;
	}

	
}
