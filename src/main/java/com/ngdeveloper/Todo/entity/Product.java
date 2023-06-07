package com.ngdeveloper.Todo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ngdeveloper.Todo.dto.ProductDto;

@Entity
@Table(name="product")
public class Product {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="mrp_price")
	private Long mrpPrice;
	
	@Column(name="selling_price")
	private Long sellingPrice;
	
	@Column(name="image")
	private String image;
	
	public Product() {
		
	}
	
	public Product(ProductDto productDto) {
		this.id = productDto.getId();
		this.name=productDto.getName();
		this.image=productDto.getImage();
		this.mrpPrice=productDto.getMrp();
		this.sellingPrice=productDto.getSellPrice();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMrpPrice() {
		return mrpPrice;
	}

	public void setMrpPrice(Long mrpPrice) {
		this.mrpPrice = mrpPrice;
	}

	public Long getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Long sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
}
