package com.example.financeManagement.Finance.mdbspringboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "inventory")
public class Inventory {
    @Id
    public String id;
    public  String part;
    public int pricePerUnit;
    public int quantity;
    public int total;

    public String getId(){
        return id;
    }
    public String getPart(){
        return part;
    }
    public int getPricePerUnit(){
        return  pricePerUnit;
    }

    public  int getQuantity(){
        return quantity;
    }
    public  int getTotal(){
        return total;
    }

}
