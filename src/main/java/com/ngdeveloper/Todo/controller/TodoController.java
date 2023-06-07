package com.ngdeveloper.Todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ngdeveloper.Todo.dto.TaskDto;
import com.ngdeveloper.Todo.service.TodoService;

@RestController
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@PostMapping("/save")
	@CrossOrigin(origins = "http://localhost:4200")
	public TaskDto saveTodo(@RequestBody TaskDto taskDto) {
		return todoService.saveTodo(taskDto);
	}
	

	@GetMapping("/read")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<TaskDto> getTasks() {
		return todoService.getTasks();
	}

}
