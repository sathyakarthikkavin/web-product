package com.ngdeveloper.Todo.dto;

import com.ngdeveloper.Todo.entity.Practice;

public class PracticeDto {
	private Long id;
	private String name;
	private String taskname;
	
	public PracticeDto()
	{
		
	}
	public PracticeDto(Practice practice)
	{
		
		this.id=practice.getId();
		this.name=practice.getName();
		this.taskname=practice.getTaskname();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	

}
