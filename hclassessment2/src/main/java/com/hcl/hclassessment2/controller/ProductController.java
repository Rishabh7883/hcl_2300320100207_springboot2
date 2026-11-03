package com.hcl.hclassessment2.controller;

import com.hcl.hclassessment2.model.Cart;
import com.hcl.hclassessment2.model.Customer;
import com.hcl.hclassessment2.model.Product;
import com.hcl.hclassessment2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private  Customer customer;

    @Autowired
    private  ProductService productService;

    @PostMapping("/addProduct")
    public ResponseEntity<?> addProduct(@RequestBody Product product){
        productService.add(product);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/browseProducts")
    public List<Product> getBrowseProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("/addProductToCart")
    public ResponseEntity<?> addProductToCart(@RequestBody Long productId){
        Cart cart=new Cart();
        cart.setCustomer(this.customer);
        cart.setDate(LocalDate.now());
        productService.addToCart(cart);
        return ResponseEntity.ok().build();
    }
}
