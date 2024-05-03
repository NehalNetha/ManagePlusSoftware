package com.example.financeManagement.Finance.service;


import com.example.financeManagement.Finance.mdbspringboot.model.Employee;
import com.example.financeManagement.Finance.mdbspringboot.model.Payroll;
import com.example.financeManagement.Finance.repository.EmployeeRepository;
import com.example.financeManagement.Finance.repository.PayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PayrollService {
    private final PayrollRepository payrollRepository;
    private final EmployeeRepository employeeRepository;



    @Autowired
    public PayrollService(PayrollRepository payrollRepository, EmployeeRepository employeeRepository){
        this.payrollRepository = payrollRepository;
        this.employeeRepository = employeeRepository;
    }



    public List<Payroll> getAllPayrolls(){return payrollRepository.findAll();}

    public  Payroll createPayroll(Payroll payroll) {return  payrollRepository.save(payroll);}

    public Optional<Employee> getEmployeeById(String id){
        return employeeRepository.findById(id);
    }


    public double getTotalSalary(){
        List<Payroll> payrolls = getAllPayrolls();
        double totalDisbursment = 0;
        for(Payroll payroll : payrolls){
            totalDisbursment += payroll.getSalary();
        }
        return totalDisbursment;
    }

    public double getTotalWithholding(){
        List<Payroll> payrolls = getAllPayrolls();
        double totalWithholding = 0;
        for(Payroll payroll: payrolls){
            totalWithholding += payroll.getWithholding();
        }
        return totalWithholding;
    }


}
