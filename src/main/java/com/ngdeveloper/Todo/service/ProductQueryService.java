package com.ngdeveloper.Todo.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngdeveloper.Todo.dto.ProductDetailsDto;
import com.ngdeveloper.Todo.entity.Product;
import com.ngdeveloper.Todo.repository.ProductDao;

@Service
public class ProductQueryService {

	@Autowired
	ProductDao productDao;
 
	public List<ProductDetailsDto> get() {		
		List<Object[]> results = productDao.findByProductWithPreferedPartners();
		List<ProductDetailsDto> productDetailsList = new ArrayList<>();
		for(Object[] obj: results) {
			ProductDetailsDto productDetailsDto = new ProductDetailsDto();
			productDetailsDto.setProductName((String) obj[0]);
			productDetailsDto.setProductPrice((BigInteger) obj[1]);
			productDetailsDto.setCategoryName((String) obj[2]);
			productDetailsDto.setStoreName((String) obj[3]);
			if(((String) obj[4])=="Cuelinks") {
			productDetailsDto.setPartnerName((String) obj[4]);
			}
			productDetailsList.add(productDetailsDto);
		}
		
		
			return getEnhanced(productDetailsList);
		}
	
	private List<ProductDetailsDto> getEnhanced(List<ProductDetailsDto> input){
		return input;
	}
	
	public List<Product> get1() {				
		return productDao.findByProductWithPreferedPartners1();
	}
}