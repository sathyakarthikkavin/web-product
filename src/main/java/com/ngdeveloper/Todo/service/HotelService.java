package com.ngdeveloper.Todo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngdeveloper.Todo.dto.HotelDto;
import com.ngdeveloper.Todo.entity.Hotel;
import com.ngdeveloper.Todo.repository.HotelRepository;

@Service
public class HotelService {
	
	@Autowired
	HotelRepository hotelRepository;
	
	public HotelDto save(HotelDto hotelDto) {
		Hotel hotel = new Hotel(hotelDto);
		Hotel hotelSaved = hotelRepository.save(hotel);
		HotelDto hotelDtoResp = new HotelDto(hotelSaved);
		return hotelDtoResp;
	}

	public List<HotelDto> getAllHotels(){
		List<Hotel> allHotels = hotelRepository.findAll();
		return allHotels.stream().map(HotelDto::new).collect(Collectors.toList());
	}
	
}
