package com.example.financeManagement.Finance.mdbspringboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "invoice")
public class Invoice {
    @Id
    private String id;

    private String customer;
    private String quantity;
    private int pricePerUnit;
    private int total;
    private LocalDate invoiceDate;

    public Invoice() {
        this.invoiceDate = LocalDate.now(); // Set the payrollDate to the current date
    }
    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setPayrollDate() {
        this.invoiceDate = LocalDate.now(); // Set the payrollDate to the current date
    }



    public String getId(){ return  id;}
    public String getCustomer(){return customer;}
    public String getQuantity(){return  quantity;}
    public int getPricePerUnit(){return  pricePerUnit;}
    public  int getTotal(){return total;}
}
