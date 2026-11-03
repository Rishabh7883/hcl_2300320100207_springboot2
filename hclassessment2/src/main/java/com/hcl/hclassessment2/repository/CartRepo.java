package com.hcl.hclassessment2.repository;

import com.hcl.hclassessment2.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepo extends JpaRepository<Cart,Long> {
    Optional<Cart> findByCartId(Long cartId);
}
