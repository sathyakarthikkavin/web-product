package com.ngdeveloper.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ngdeveloper.Todo.service.ProductService;

@Component
public class ProductUpdateScheduler {
	static int counter = 1;
	
	@Autowired
	ProductService productService;
	
	@Scheduled(cron="*/5 * * ? * *")
	public void printMeEvery5Second() {
		System.out.println(counter++);
		productService.getAllProducts();
	}
}
