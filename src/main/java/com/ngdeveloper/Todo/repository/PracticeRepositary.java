package com.ngdeveloper.Todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ngdeveloper.Todo.entity.Practice;

@Repository

public interface PracticeRepositary extends JpaRepository<Practice,Long> {

}
