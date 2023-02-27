package com.Ecommerce.Ecommerce.service;
import com.Ecommerce.Ecommerce.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.Ecommerce.model.User;


@Service
public class UserService {

    @Autowired
    private IUserRepo iUserRepository;

    public User getUserById(Integer userId) {
        User user=iUserRepository.findById(userId).get();
        return user;
    }

}