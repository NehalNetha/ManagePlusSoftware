package com.example.financeManagement.Finance.Controllers;

import com.example.financeManagement.Finance.mdbspringboot.model.Customer;
import com.example.financeManagement.Finance.mdbspringboot.model.Employee;
import com.example.financeManagement.Finance.service.CustomerService;
import com.example.financeManagement.Finance.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping(path = "/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @PostMapping(path = "/customers")
    public Customer createCustomer(@RequestBody Customer customer){ return customerService.createCustomer(customer);}

}
