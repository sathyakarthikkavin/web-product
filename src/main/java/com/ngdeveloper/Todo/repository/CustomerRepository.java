package com.ngdeveloper.Todo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ngdeveloper.Todo.entity.CustomerEntity;
@Repository

public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer> {
	
	Optional<CustomerEntity> findByName(String name);
	
	List<CustomerEntity> findByIssueID(String storeName);
	
	

}
