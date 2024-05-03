package com.example.financeManagement.Finance.Controllers;


import com.example.financeManagement.Finance.mdbspringboot.model.Expenses;
import com.example.financeManagement.Finance.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class ExpenseController {
    private final ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService){
        this.expenseService = expenseService;
    }

    @GetMapping(path = "/expenses")
    public List<Expenses> getAllExpenses(){
        return expenseService.getAllExpenses();
    }

    @GetMapping(path = "/expenses/totalExpenses")
    public  double getTotalExpenses(){
        return expenseService.getTotalExpenses();
    }

    @PostMapping(path = "/expenses")
    public Expenses createExpense(@RequestBody Expenses expenses){
        return expenseService.createExpense(expenses);
    }
}
