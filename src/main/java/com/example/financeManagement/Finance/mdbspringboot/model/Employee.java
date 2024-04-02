package com.example.financeManagement.Finance.mdbspringboot.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "employees")
public class Employee {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String addressLineOne;
    private String addressLineTwo;
    private String city;
    private String state;
    private String zip;
    private int withholding;
    private int salary;



    public String getId() {
        return id;
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
    public int getWithholding() {return withholding;}

    public int getSalary() {return salary;}







}
