package com.example.financeManagement.Finance.repository;

import com.example.financeManagement.Finance.mdbspringboot.model.PurchaseOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PurchaseOrderRepository extends MongoRepository<PurchaseOrder, String> {
}
