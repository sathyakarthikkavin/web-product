package com.ngdeveloper.Todo.dto;

import com.ngdeveloper.Todo.entity.Todo;

public class TaskDto {

	private Long id;
	private String name;	
	private String status;
	private long monthlySalary;
	
	public TaskDto() {
		
	}
	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public TaskDto(Todo todo) {
		this.id = todo.getId();
		this.name = todo.getTaskName();
		this.status = todo.getStatus();
	}

	public long getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(long monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	
}
