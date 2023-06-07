package com.ngdeveloper.Todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ngdeveloper.Todo.dto.SavejiDto;
import com.ngdeveloper.Todo.service.SavejiService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/saveji")

public class SavejiController  

{
	@Autowired
	SavejiService savejiservice;
	
@PostMapping("/save")
@CrossOrigin(origins = "http://localhost:4200")
public SavejiDto save(@RequestBody SavejiDto savejidto)
{
	return savejiservice.save(savejidto);
}

}
