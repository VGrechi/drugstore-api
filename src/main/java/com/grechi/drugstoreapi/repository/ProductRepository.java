package com.grechi.drugstoreapi.repository;

import com.grechi.drugstoreapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
