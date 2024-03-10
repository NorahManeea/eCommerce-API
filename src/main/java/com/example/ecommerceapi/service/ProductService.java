package com.example.ecommerceapi.service;

import com.example.ecommerceapi.entity.Product;
import com.example.ecommerceapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long Id){
        return productRepository.findById(Id);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

}
