package com.Ecommerce.Ecommerce.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ecommerce.Ecommerce.model.Product;


@Repository
public interface IProductRepo extends JpaRepository<Product, Integer> {

    public List<Product> findByCategory(String category);

}