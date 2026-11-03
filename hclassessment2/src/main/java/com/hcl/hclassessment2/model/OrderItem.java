package com.hcl.hclassessment2.model;

import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue
    private Long orderItemId;

    private CustomerOrder customerOrder;

    private Product product;

    private Integer quantity;

    private Double price;

    public Long getOrderItemId() {
        return orderItemId;
    }
}
