package com.example.financeManagement.Finance.repository;

import com.example.financeManagement.Finance.mdbspringboot.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
