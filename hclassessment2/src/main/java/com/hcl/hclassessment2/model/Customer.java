package com.hcl.hclassessment2.model;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String customerName;
    private String email;
    private String password;
    private String mobile;
    private String city;

    public Long getCustomerId() {
        return customerId;
    }
}
