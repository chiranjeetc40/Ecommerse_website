package com.yash.productmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yash.productmicroservice.entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	@Query("from Product p where p.name=:name")
	public Product findByName(String name);
}
