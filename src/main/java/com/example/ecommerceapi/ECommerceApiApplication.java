package com.example.ecommerceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;



@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })

public class ECommerceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApiApplication.class, args);
	}

}
