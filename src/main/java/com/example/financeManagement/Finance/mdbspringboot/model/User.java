package com.example.financeManagement.Finance.mdbspringboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    public User() {
        // Default constructor required by Spring Data MongoDB
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }
}
