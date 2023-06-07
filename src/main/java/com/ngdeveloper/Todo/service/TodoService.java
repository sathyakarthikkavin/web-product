package com.ngdeveloper.Todo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ngdeveloper.Todo.dto.TaskDto;
import com.ngdeveloper.Todo.entity.Todo;
import com.ngdeveloper.Todo.helper.TaxCalculationHelper;
import com.ngdeveloper.Todo.repository.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	TodoRepository todoRepository;
	
	@Autowired
	TaxCalculationHelper taxCalculationHelper;

	public TaskDto saveTodo(TaskDto taskDto) {
		// convert taskDto to Todo
		Todo todo = new Todo(taskDto);
		todo.setTax(taxCalculationHelper.getTax(taskDto.getMonthlySalary()));
		Todo savedTodo = todoRepository.save(todo);
		
		return new TaskDto(savedTodo);		
	}
	
	
	public List<TaskDto> getTasks() {		
		List<Todo> todos = todoRepository.findAll();
		List<TaskDto> tasks = todos.stream().map(e -> new TaskDto(e)).collect(Collectors.toList());
		return tasks;			
	}
	
	
	
//	public List<Todo> getAllTodo() {		
//		List<Todo> todos = todoRepository.findAll();
//		return todos;		
//	}
	
}
