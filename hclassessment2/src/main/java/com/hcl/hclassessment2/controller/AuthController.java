package com.hcl.hclassessment2.controller;

import com.hcl.hclassessment2.model.Customer;
import com.hcl.hclassessment2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Customer customer){
        customerService.addCustomer(customer);
        return ResponseEntity.ok().build();
    }
}
