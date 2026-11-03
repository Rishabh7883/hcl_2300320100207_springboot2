package com.hcl.hclassessment2.service;

import com.hcl.hclassessment2.model.Cart;
import com.hcl.hclassessment2.model.Product;
import com.hcl.hclassessment2.repository.CartRepo;
import com.hcl.hclassessment2.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private CartRepo cartRepo;

    @Autowired
    private ProductRepo productRepo;

    public void add(Product product){
        productRepo.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public void addToCart(Cart cart) {
        cartRepo.save(cart);
    }
}
