package com.leonardo.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.webservicesspring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
