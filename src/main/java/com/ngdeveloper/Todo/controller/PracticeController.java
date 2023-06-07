package com.ngdeveloper.Todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ngdeveloper.Todo.dto.PracticeDto;
import com.ngdeveloper.Todo.service.PracticeService;

@RestController
@RequestMapping("/practice")
public class PracticeController {
	
	@Autowired
	PracticeService praticreService;
	
	
	@GetMapping("/getAllPracticeList")
	public List<PracticeDto> getAllPracticeList()
	{
		return praticreService.getAll() ;
		
	}
	

}
