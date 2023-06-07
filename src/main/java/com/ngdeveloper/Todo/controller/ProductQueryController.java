package com.ngdeveloper.Todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ngdeveloper.Todo.dto.ProductDetailsDto;
import com.ngdeveloper.Todo.entity.Product;
import com.ngdeveloper.Todo.service.ProductQueryService;

@RestController
@RequestMapping("/product")
public class ProductQueryController {
		
		@Autowired
		ProductQueryService productQueryService;
		
		// object[] -> [id, name, price, store_name, category_name, partner_name]
		// List<Object[]> -> 
		@GetMapping("/getAllProductQueryList")
		public List<ProductDetailsDto> getAllProductQueryList()
		{
			return productQueryService.get();
			
		}
		
		@GetMapping("/getAllProductQueryList1")
		public List<Product> getAllProductQueryList1()
		{
			return productQueryService.get1();
			
		}
		

}
