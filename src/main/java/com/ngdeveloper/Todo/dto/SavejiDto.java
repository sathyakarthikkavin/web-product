package com.ngdeveloper.Todo.dto;

import com.ngdeveloper.Todo.entity.Saveji;

public class SavejiDto {
	private Long id;
	private String coupon_offer;
	private String coupon_name;
	public SavejiDto()
	{
		
	}
	
	
	public SavejiDto(Saveji saveji)
	{
		this.id=saveji.getId();
		this.coupon_offer=saveji.getCouponOffer();
		this.coupon_name=saveji.getCouponName();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCoupon_offer() {
		return coupon_offer;
	}
	public void setCoupon_offer(String coupon_offer) {
		this.coupon_offer = coupon_offer;
	}
	public String getCoupon_name() {
		return coupon_name;
	}
	public void setCoupon_name(String coupon_name) {
		this.coupon_name = coupon_name;
	}
	
	
	
	

}
