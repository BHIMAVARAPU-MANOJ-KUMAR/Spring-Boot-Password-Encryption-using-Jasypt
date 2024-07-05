package com.jasypt.passwordencryptor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;


@Data
@Entity(name = "products")
@Table(name = "products", uniqueConstraints = @UniqueConstraint(columnNames = {"product_uuid"}))
public class Products {
	
	@Id
	@Column(name = "product_uuid", nullable = false, updatable = false, unique = true,
	columnDefinition = "VARCHAR(250)")
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	
	@Column(name = "product_name", nullable = false, columnDefinition = "VARCHAR(250)")
	private String productName;
	
	@Column(name = "product_stock_available", nullable = false, columnDefinition = "INTEGER")
	private Integer productQuantity;
	
	@Column(name = "product_price", nullable = false, columnDefinition = "DOUBLE")
	private Double productPrice;
}
