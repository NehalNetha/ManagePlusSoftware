package com.example.financeManagement.Finance.Controllers;


import com.example.financeManagement.Finance.mdbspringboot.model.Employee;
import com.example.financeManagement.Finance.mdbspringboot.model.Payroll;
import com.example.financeManagement.Finance.service.PayrollService;
import com.example.financeManagement.Finance.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class PayrollController {

    private final PayrollService payrollService;

    @Autowired
    public PayrollController(PayrollService payrollService){this.payrollService = payrollService;}

    @GetMapping(path = "/payrolls")
    public List<Payroll> getAllPayrolls(){return payrollService.getAllPayrolls();}

    @GetMapping(path = "/payrolls/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable String id){
        Optional<Employee> employee = payrollService.getEmployeeById(id);
        return employee.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping(path = "/payrolls")
    public  Payroll createPayrolls(@RequestBody Payroll payroll){
        return payrollService.createPayroll(payroll);
    }

    @GetMapping(path = "/yashitha")
    public String helloWorld(){
        return "Hello yashita";
    }

    @GetMapping(path = "/payrolls/totalSalary")
    public double getTotalSalary(){
        return payrollService.getTotalSalary();
    }

    @GetMapping(path = "/payrolls/totalWithholding")
    public double getTotalWithholding(){
        return payrollService.getTotalWithholding();
    }



}
