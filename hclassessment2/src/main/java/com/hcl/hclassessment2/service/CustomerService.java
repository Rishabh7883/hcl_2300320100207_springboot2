package com.hcl.hclassessment2.service;

import com.hcl.hclassessment2.model.Customer;
import com.hcl.hclassessment2.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public void addCustomer(Customer customer){
        customerRepo.save(customer);
    }
}
