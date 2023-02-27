package com.Ecommerce.Ecommerce.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Ecommerce.model.Order;
import com.Ecommerce.Ecommerce.service.OrderService;



@RestController
public class OderController {
    @Autowired
    private OrderService orderService;

    @GetMapping(value = "getOrder/{orderid}")
    public List<Order> getOrderById(@PathVariable Integer orderid) {
        return orderService.getOrder(orderid);
    }
}
