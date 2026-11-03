package com.hcl.hclassessment2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private Customer customer;

    private LocalDateTime orderDate;

    private Double totalAmount;

    private String orderStatus;

    public Long getOrderId() {
        return orderId;
    }
}
