package com.ngdeveloper.Todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ngdeveloper.Todo.entity.Employee;

public interface EmloyeeRepository extends JpaRepository<Employee,Long> {

}
