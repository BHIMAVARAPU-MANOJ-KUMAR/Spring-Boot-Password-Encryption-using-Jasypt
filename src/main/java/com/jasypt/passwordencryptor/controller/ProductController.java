package com.jasypt.passwordencryptor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jasypt.passwordencryptor.entity.Products;
import com.jasypt.passwordencryptor.service.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/addProduct")
    public Products addProduct(@RequestBody Products product) {
        return service.saveProduct(product);
    }
	
	@PostMapping("/addProducts")
    public List<Products> addProducts(@RequestBody List<Products> products) {
        return service.saveProducts(products);
    }
	
	@GetMapping("/products")
    public List<Products> findAllProducts() {
        return service.getProducts();
    }
	
	@GetMapping("/pid/{id}")
	public Products findProductById(@PathVariable String id) {
	    return service.getProductById(id);
	}
	
//	 @GetMapping("/product/{name}")
//	    public Product findProductByName(@PathVariable String name) {
//	        return service.getProductByName(name);
//	    }
//
//	    @PutMapping("/update")
//	    public Product updateProduct(@RequestBody Product product) {
//	        return service.updateProduct(product);
//	    }
//
//	    @DeleteMapping("/delete/{id}")
//	    public String deleteProduct(@PathVariable int id) {
//	        return service.deleteProduct(id);
//	    }
}
