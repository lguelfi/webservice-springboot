package com.leonardo.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.webservicesspring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
