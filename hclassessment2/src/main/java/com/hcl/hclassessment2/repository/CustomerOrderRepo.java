package com.hcl.hclassessment2.repository;

import com.hcl.hclassessment2.model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerOrderRepo extends JpaRepository<CustomerOrder,Long> {
    Optional<CustomerOrder> findByOrderId(Long orderId);
}
