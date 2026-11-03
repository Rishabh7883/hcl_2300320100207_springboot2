package com.hcl.hclassessment2.service;

import com.hcl.hclassessment2.model.OrderItem;
import com.hcl.hclassessment2.repository.OrderItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderItemRepo orderItemRepo;

    public void addOrderItem(OrderItem orderItem) {
        orderItemRepo.save(orderItem);
    }
}
