package com.ngdeveloper.Todo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ngdeveloper.Todo.dto.TaskDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="todo")
public class Todo {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="task_name")
	private String taskName;
	
	@Column(name="status")
	private String status;
	
	@Column(name="tax")
	private long tax;
	
	public Todo() {
		
	}
	
	

	public Todo(Long id, String taskName, String status) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.status = status;
	}


	public Todo(TaskDto taskDto) {		
		//this.id = taskDto.getId()!=0L ? taskDto.getId() : null;
		this.id =  taskDto.getId();
		this.taskName = taskDto.getName();
		this.status = taskDto.getStatus();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



	public long getTax() {
		return tax;
	}



	public void setTax(long tax) {
		this.tax = tax;
	}
	
	
}
