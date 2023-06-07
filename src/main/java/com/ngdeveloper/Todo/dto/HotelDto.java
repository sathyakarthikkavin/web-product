package com.ngdeveloper.Todo.dto;

import com.ngdeveloper.Todo.entity.Hotel;

public class HotelDto {
	private Long id; // Long -> null | long -> not possible
	private String name;
	private String location;
	private String imageUrl;
	private Double price;
	
	
	public HotelDto() {
		
	}
	
	
	public HotelDto(Hotel hotel) {
		this.id=hotel.getId();
		this.name=hotel.getName();
		this.location=hotel.getLocation();
		this.imageUrl=hotel.getImageUrl();
		this.price=hotel.getPrice();
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
