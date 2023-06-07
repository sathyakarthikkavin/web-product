package com.ngdeveloper.Todo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ngdeveloper.Todo.dto.SavejiDto;

@Entity
@Table(name="saveji")
public class Saveji {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="coupon_offer")
	private String couponOffer;
	@Column(name="coupon_name")
	private String couponName;
	
	public Saveji()
	{
		
	}

	public Saveji(Long id, String couponOffer, String couponName) {
		super();
		this.id = id;
		this.couponOffer = couponOffer;
		this.couponName = couponName;
	}
	public Saveji(SavejiDto savejidto)
	{
		this.id=savejidto.getId();
		this.couponOffer=savejidto.getCoupon_offer();
		this.couponName=savejidto.getCoupon_name();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCouponOffer() {
		return couponOffer;
	}

	public void setCouponOffer(String couponOffer) {
		this.couponOffer = couponOffer;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	

}
