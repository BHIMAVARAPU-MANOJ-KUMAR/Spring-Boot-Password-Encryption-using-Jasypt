package com.jasypt.passwordencryptor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jasypt.passwordencryptor.entity.Products;
import com.jasypt.passwordencryptor.repository.ProductRepository;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class PasswordencryptorApplication {
	
	private ProductRepository repository;
	
	public PasswordencryptorApplication(ProductRepository repository) {
		this.repository = repository;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PasswordencryptorApplication.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner() {
		return args-> {
			Products products = new Products();
			products.setProductName("IPhone 13 Pro");
			products.setProductQuantity(10);
			products.setProductPrice(54999.90);
			repository.save(products);
			
			Products products2 = new Products();
			products2.setProductName("Samsung Galaxy S24");
			products2.setProductQuantity(4);
			products2.setProductPrice(87999.99);
			repository.save(products2);
		};
	}

}
