package com.ngdeveloper.Todo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngdeveloper.Todo.dto.PracticeDto;

import com.ngdeveloper.Todo.entity.Practice;

import com.ngdeveloper.Todo.repository.PracticeRepositary;

@Service
public class PracticeService {
	@Autowired
	PracticeRepositary practiceRep;
	public List<PracticeDto> getAll()
	{
				List<PracticeDto> practiceList = new ArrayList<>();
				List<Practice> practiceEntity = practiceRep.findAll();
				for(Practice each : practiceEntity) {
					PracticeDto practiceDto = new PracticeDto(each);
					practiceList.add(practiceDto);
				}
				return practiceList;
				
			}
		
	}
	


