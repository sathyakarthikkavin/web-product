package com.ngdeveloper.Todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ngdeveloper.Todo.dto.HotelDto;
import com.ngdeveloper.Todo.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	HotelService hotelService;
		

	@PostMapping("/save")
	@CrossOrigin(origins = "http://localhost:4200")
	public HotelDto save(@RequestBody HotelDto hotelDto) {
		return hotelService.save(hotelDto);
	}
	
	@GetMapping("/get-all")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<HotelDto> getAll() {
		return hotelService.getAllHotels();
	}
	
}

