package com.example.financeManagement.Finance.repository;

import com.example.financeManagement.Finance.mdbspringboot.model.Expenses;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expenses, String> {
}
