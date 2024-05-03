package com.example.financeManagement.Finance.Controllers;


import com.example.financeManagement.Finance.mdbspringboot.model.Customer;
import com.example.financeManagement.Finance.mdbspringboot.model.Invoice;
import com.example.financeManagement.Finance.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class InvoiceController {

    private final InvoiceService invoiceService;


    @Autowired
    public InvoiceController(InvoiceService invoiceService){this.invoiceService = invoiceService;}

    @GetMapping(path = "/invoice")
    public List<Invoice> getAllInvoice(){ return  invoiceService.getAllInvoices();}

    @GetMapping(path = "/invoice/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable String id){
        Optional<Customer> customer = invoiceService.getCustomerById(id);
        return  customer.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping(path = "/invoice/totalOrders")
    public double getTotalOrder(){
        return invoiceService.getTotalOrders();
    }

    @PostMapping(path = "/invoice")
    public  Invoice createInvoice(@RequestBody Invoice invoice){return  invoiceService.createInvoice(invoice);}
}
