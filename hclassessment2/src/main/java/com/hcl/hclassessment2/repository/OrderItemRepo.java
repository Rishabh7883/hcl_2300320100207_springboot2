package com.hcl.hclassessment2.repository;

import com.hcl.hclassessment2.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderItemRepo extends JpaRepository<OrderItem,Long> {
    Optional<OrderItem> findById(Long id);
}
