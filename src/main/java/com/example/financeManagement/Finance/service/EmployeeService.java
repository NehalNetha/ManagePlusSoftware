package com.example.financeManagement.Finance.service;

import com.example.financeManagement.Finance.mdbspringboot.model.Employee;
import com.example.financeManagement.Finance.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees(){

        return employeeRepository.findAll();
    }

    public  Employee createEmployee(Employee employee){

        return employeeRepository.save(employee);
    }

}
