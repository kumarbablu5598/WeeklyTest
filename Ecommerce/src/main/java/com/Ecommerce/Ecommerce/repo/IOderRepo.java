package com.Ecommerce.Ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ecommerce.Ecommerce.model.Order;

@Repository
public interface IOderRepo  extends JpaRepository<Order, Integer> {

}