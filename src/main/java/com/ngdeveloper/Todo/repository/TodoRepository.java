package com.ngdeveloper.Todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ngdeveloper.Todo.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{

}
