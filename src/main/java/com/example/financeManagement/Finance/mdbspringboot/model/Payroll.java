package com.example.financeManagement.Finance.mdbspringboot.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document(collection = "payrolls")
public class Payroll {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private int salary;
    private int withholding;

    private LocalDate payrollDate;

    public Payroll() {
        this.payrollDate = LocalDate.now(); // Set the payrollDate to the current date
    }

    public String getId() {return id;}
    public String getFirstname() {return  firstname;}
    public String getLastname() {return  lastname;}

    public  int getSalary() {return salary;}

    public int getWithholding(){return  withholding;}

    public LocalDate getPayrollDate() {
        return payrollDate;
    }

    public void setPayrollDate() {
        this.payrollDate = LocalDate.now(); // Set the payrollDate to the current date
    }


}
