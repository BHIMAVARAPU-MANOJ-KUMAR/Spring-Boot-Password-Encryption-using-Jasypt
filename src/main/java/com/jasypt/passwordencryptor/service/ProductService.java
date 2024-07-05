package com.jasypt.passwordencryptor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jasypt.passwordencryptor.entity.Products;
import com.jasypt.passwordencryptor.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Products saveProduct(Products products) {
		return productRepository.save(products);
	}
	
	public List<Products> saveProducts(List<Products> products) {
        return productRepository.saveAll(products);
    }
	
	public List<Products> getProducts() {
        return productRepository.findAll();
    }

    public Products getProductById(String id) {
        return productRepository.findByProductId(id).orElse(null);
    }

//    public Products getProductByName(String name) {
//        return productRepository.findBy
//    }
//
//    public String deleteProduct(int id) {
//        repository.deleteById(id);
//        return "product removed !! " + id;
//    }
//
//    public Products updateProduct(Products product) {
//        Product existingProduct = repository.findById(product.getId()).orElse(null);
//        existingProduct.setName(product.getName());
//        existingProduct.setQuantity(product.getQuantity());
//        existingProduct.setPrice(product.getPrice());
//        return repository.save(existingProduct);
//    }
}
