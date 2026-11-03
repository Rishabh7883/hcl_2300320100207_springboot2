package com.hcl.hclassessment2.model;

import jakarta.persistence.*;

@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartItemid;

    @ManyToOne
    private Product product;

    private Integer quantity;

    private Double price;

    public Long getCartItemid() {
        return cartItemid;
    }
}
