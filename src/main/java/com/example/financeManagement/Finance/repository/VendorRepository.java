package com.example.financeManagement.Finance.repository;

import com.example.financeManagement.Finance.mdbspringboot.model.Vendor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VendorRepository extends MongoRepository<Vendor, String> {

}
