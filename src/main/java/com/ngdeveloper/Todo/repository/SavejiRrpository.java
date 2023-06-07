package com.ngdeveloper.Todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ngdeveloper.Todo.entity.Saveji;

@Repository


public interface SavejiRrpository extends JpaRepository<Saveji,Long>

{

}
