package com.ngdeveloper.Todo.dto;

import com.ngdeveloper.Todo.entity.Product;

public class ProductDto {

	private Long id;
	private String name;	
	private String image;
	private Long mrp;
	private Long sellPrice;
	
	public ProductDto() {
		
	}
	
	public ProductDto(Product product) {		
		this.id=product.getId();
		this.name=product.getName();
		this.image=product.getImage();
		this.mrp=product.getMrpPrice();
		this.sellPrice=product.getSellingPrice();
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Long getMrp() {
		return mrp;
	}

	public void setMrp(Long mrp) {
		this.mrp = mrp;
	}

	public Long getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(Long sellPrice) {
		this.sellPrice = sellPrice;
	}
	
	
	
	
}
