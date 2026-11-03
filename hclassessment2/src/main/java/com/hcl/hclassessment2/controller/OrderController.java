package com.hcl.hclassessment2.controller;

import com.hcl.hclassessment2.model.OrderItem;
import com.hcl.hclassessment2.repository.OrderItemRepo;
import com.hcl.hclassessment2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/placeOrder")
    public ResponseEntity<?> placeOrder(@RequestBody OrderItem orderItem) {
        orderService.addOrderItem(orderItem);
        return ResponseEntity.ok().build();
    }
}
