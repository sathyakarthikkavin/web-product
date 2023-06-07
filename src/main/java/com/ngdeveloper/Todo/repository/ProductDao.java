package com.ngdeveloper.Todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ngdeveloper.Todo.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Long>{
	
	@Query(value = "select p.name, p.selling_price, pc.name as category_name,s.name as store_name, par.name as partner_name from product \r\n"
			+ "p join product_category as pc on\r\n"
			+ "p.product_category_id = pc.id \r\n"
			+ "join store s\r\n"
			+ "on s.id = p.store_id\r\n"
			+ "join partners par\r\n"
			+ "on par.id = s.prefered_partner_id\r\n"
			+ "where pc.name = 'Electronics' and p.valid = 'Y'", nativeQuery = true)
	List<Object[]> findByProductWithPreferedPartners();
	
	@Query(value = "select p.id, p.name, p.image, p.mrp_price, p.selling_price from product \r\n"
			+ "p join product_category pc on\r\n"
			+ "p.product_category_id = pc.id \r\n"
			+ "join store s\r\n"
			+ "on s.id = p.store_id\r\n"
			+ "join partners par\r\n"
			+ "on par.id = s.prefered_partner_id\r\n"
			+ "where pc.name = 'Electronics' and p.valid = 'Y'", nativeQuery = true)
	List<Product> findByProductWithPreferedPartners1();

}
