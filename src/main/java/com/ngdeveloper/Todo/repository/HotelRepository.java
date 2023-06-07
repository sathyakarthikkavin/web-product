package com.ngdeveloper.Todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ngdeveloper.Todo.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{

}
