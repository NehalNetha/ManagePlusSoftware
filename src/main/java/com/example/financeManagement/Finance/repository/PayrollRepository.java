package com.example.financeManagement.Finance.repository;

import com.example.financeManagement.Finance.mdbspringboot.model.Payroll;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PayrollRepository extends MongoRepository<Payroll, String> {

}
