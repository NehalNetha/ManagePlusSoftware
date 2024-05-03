package com.example.financeManagement.Finance.mdbspringboot.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "purchaseOrder")

public class PurchaseOrder {
    @Id
    private String id;
    private String vendor;
    private String part;

    private String quantity;
    private int pricePerUnit;
    private int total;
    private LocalDate purchaseOrderDate;

    public PurchaseOrder() {
        this.purchaseOrderDate = LocalDate.now(); // Set the payrollDate to the current date
    }

    public LocalDate getPurchaseOrderDate() {
        return purchaseOrderDate;
    }

    public void setPurchaseOrderDate() {
        this.purchaseOrderDate = LocalDate.now();
    }

    public String getId() {
        return id;
    }
    public  String getVendor() {
        return vendor;
    }

    public String getQuantity(){
        return  quantity;
    }

    public int getPricePerUnit(){
        return  pricePerUnit;
    }

    public int getTotal(){
        return  total;
    }

    public  String getPart(){
        return  part;
    }

}