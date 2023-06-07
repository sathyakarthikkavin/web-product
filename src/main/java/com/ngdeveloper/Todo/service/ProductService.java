package com.ngdeveloper.Todo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngdeveloper.Todo.dto.ProductDto;
import com.ngdeveloper.Todo.entity.Product;
import com.ngdeveloper.Todo.repository.ProductDao;

@Service
public class ProductService {
	
	@Autowired
	ProductDao productDao;
	
	public List<ProductDto> getAllProducts(){
		List<ProductDto> productDtoList = new ArrayList<>();
		List<Product> products = productDao.findAll();
		for(Product each : products) {
			ProductDto productDto = new ProductDto(each);
			productDtoList.add(productDto);
		}
		return productDtoList;
		
	}

}
