package com.ngdeveloper.Todo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ngdeveloper.Todo.dto.HotelDto;

@Entity
@Table(name="hotel")
public class Hotel {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="location")
	private String location;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="image")
	private String imageUrl;
	
	public Hotel() {
		
	}

	public Hotel(Long id, String name, String location, Double price, String imageUrl) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.price = price;
		this.imageUrl = imageUrl;
	}
	
	public Hotel(HotelDto hotelDto) {
		this.id=hotelDto.getId();
		this.name=hotelDto.getName();
		this.location=hotelDto.getLocation();
		this.imageUrl=hotelDto.getImageUrl();
		this.price=hotelDto.getPrice();
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
	
	
	
	
}
