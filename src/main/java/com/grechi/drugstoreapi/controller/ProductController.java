package com.grechi.drugstoreapi.controller;

import com.grechi.drugstoreapi.entity.Product;
import com.grechi.drugstoreapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public List<Product> getProducts(){
        return productRepository.findAll();
    }
}
