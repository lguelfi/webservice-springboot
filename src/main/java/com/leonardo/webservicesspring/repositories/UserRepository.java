package com.leonardo.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.webservicesspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
