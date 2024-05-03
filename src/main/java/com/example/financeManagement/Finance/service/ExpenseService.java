package com.example.financeManagement.Finance.service;

import com.example.financeManagement.Finance.mdbspringboot.model.Expenses;
import com.example.financeManagement.Finance.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private  final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository){
        this.expenseRepository = expenseRepository;
    }

    public List<Expenses> getAllExpenses(){
        return expenseRepository.findAll();
    }

    public Expenses createExpense(Expenses expenses){
        return  expenseRepository.save(expenses);
    }

    public double getTotalExpenses(){
        List<Expenses> expenses = getAllExpenses();
        double totalExpenses = 0;
        for(Expenses expense: expenses){
            totalExpenses  += expense.getCostPerMonth();
        }
        return totalExpenses;
    }
}
