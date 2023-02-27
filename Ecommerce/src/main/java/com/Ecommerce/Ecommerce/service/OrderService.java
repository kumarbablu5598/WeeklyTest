package com.Ecommerce.Ecommerce.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.Ecommerce.model.Order;
import com.Ecommerce.Ecommerce.repo.IOderRepo;

@Service
public class OrderService {
    @Autowired
    private IOderRepo iOrderRepo;

    public List<Order> getOrder(Integer orderid) {
        List<Order> orders = new ArrayList<>();
        orders.add(iOrderRepo.findById(orderid).get());
        return orders;
    }
}
