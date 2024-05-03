package com.example.financeManagement.Finance.mdbspringboot.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vendors")
public class Vendor {
    @Id
    private String id;

    private String company;
    private String equipment;
    private int price;
    private String addressLine;
    private String city;
    private String state;
    private String zip;

    public String getId() {return id;}
    public String getCompany() {return  company;}
    public String getEquipment() {return  equipment;}

    public int getPrice(){return  price;}
    public  String getAddressLine() {return addressLine;}
    public  String getCity() { return  city;}
    public String getState() {return state;}
    public String getZip() {return  zip;}



}
