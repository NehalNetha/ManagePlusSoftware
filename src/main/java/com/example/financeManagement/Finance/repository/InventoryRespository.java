package com.example.financeManagement.Finance.repository;

import com.example.financeManagement.Finance.mdbspringboot.model.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRespository extends MongoRepository<Inventory, String> {
}
