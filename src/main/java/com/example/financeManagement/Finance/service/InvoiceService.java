package com.example.financeManagement.Finance.service;

import com.example.financeManagement.Finance.mdbspringboot.model.Customer;
import com.example.financeManagement.Finance.mdbspringboot.model.Invoice;
import com.example.financeManagement.Finance.repository.CustomerRepository;
import com.example.financeManagement.Finance.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {
    private  final InvoiceRepository invoiceRepository;
    private final CustomerRepository customerRepository;


    @Autowired
    public  InvoiceService(InvoiceRepository invoiceRepository, CustomerRepository customerRepository){
        this.invoiceRepository = invoiceRepository;
        this.customerRepository = customerRepository;
    }



    public List<Invoice> getAllInvoices(){return  invoiceRepository.findAll();}

    public Invoice createInvoice(Invoice invoice){return  invoiceRepository.save(invoice);}

    public Optional<Customer> getCustomerById(String id){
        return customerRepository.findById(id);
    }

    public double getTotalOrders(){
        List<Invoice> orders = getAllInvoices();
        double totalOrders = 0;
        for(Invoice invoice: orders){
           totalOrders += invoice.getTotal();
        }
        return totalOrders;
    }
}
