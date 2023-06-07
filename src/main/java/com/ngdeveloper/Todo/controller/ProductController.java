package com.ngdeveloper.Todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ngdeveloper.Todo.dto.ProductDto;
import com.ngdeveloper.Todo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/getAllProducts")	
	@CrossOrigin("http://localhost:4200")
	public List<ProductDto> getAllProducts(){
		return productService.getAllProducts();
	}

}
