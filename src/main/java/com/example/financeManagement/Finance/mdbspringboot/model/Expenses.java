package com.example.financeManagement.Finance.mdbspringboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "expenses")
public class Expenses {
    @Id
    public String id;
    public String expense;
    public int costPerMonth;
    public LocalDate expenseDate;

    public Expenses() {
        this.expenseDate = LocalDate.now();
    }

    public LocalDate getExpenseDate() {
        return expenseDate;
    }

    public void setPayrollDate() {
        this.expenseDate = LocalDate.now();
    }


    public String getId(){
        return id;
    }

    public  String getExpense(){
        return  expense;
    }

    public  int getCostPerMonth(){
        return costPerMonth;
    }


}
