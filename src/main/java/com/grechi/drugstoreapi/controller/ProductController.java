package com.grechi.drugstoreapi.controller;

import com.grechi.drugstoreapi.entity.Product;
import com.grechi.drugstoreapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin
    public ResponseEntity postProduct(@RequestBody Product product) {
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
