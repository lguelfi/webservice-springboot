package com.leonardo.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.webservicesspring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
