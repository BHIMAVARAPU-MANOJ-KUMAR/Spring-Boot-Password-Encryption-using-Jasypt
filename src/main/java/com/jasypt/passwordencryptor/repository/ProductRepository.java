package com.jasypt.passwordencryptor.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jasypt.passwordencryptor.entity.Products;

public interface ProductRepository extends JpaRepository<Products, String>{
	
	@Query(value = "SELECT * FROM products WHERE product_uuid=?1", nativeQuery = true)
	Optional<Products> findByProductId(String id);
}
