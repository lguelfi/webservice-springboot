package com.leonardo.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.webservicesspring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
