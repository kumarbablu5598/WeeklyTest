package com.Ecommerce.Ecommerce.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ecommerce.Ecommerce.model.User;

@Repository
public interface IUserRepo extends JpaRepository<User, Integer> {

}