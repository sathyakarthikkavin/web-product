package com.ngdeveloper.Todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngdeveloper.Todo.dto.SavejiDto;
import com.ngdeveloper.Todo.entity.Saveji;
import com.ngdeveloper.Todo.repository.SavejiRrpository;

@Service
public class SavejiService {
	
	@Autowired
	SavejiRrpository savejirepositary;
	
	
	public SavejiDto save(SavejiDto savejidto)
	{
		Saveji sv=new Saveji(savejidto);
		Saveji svde=savejirepositary.save(sv);
		SavejiDto svd=new SavejiDto(svde);
		return svd;
				}


	private SavejiDto SavejiDto(SavejiDto savejidto) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
