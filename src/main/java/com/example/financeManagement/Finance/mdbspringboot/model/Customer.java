package com.example.financeManagement.Finance.mdbspringboot.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
public class Customer {
    @Id
    private String id;
    private String company;
    private String firstname;
    private String lastname;
    private String addressLineOne;
    private String addressLineTwo;
    private String city;
    private String state;
    private String zip;
    private int price;
    public String getId() {
        return id;
    }
    public String getCompany() {
        return company;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getAddressLineOne() {
        return addressLineOne;
    }
    public String  getAddressLineTwo() {
        return addressLineTwo;
    }
    public String getCity() {return city;}
    public String getState() {return state;}
    public String getZip() {return zip;}
    public int getPrice() {return price;}

}
