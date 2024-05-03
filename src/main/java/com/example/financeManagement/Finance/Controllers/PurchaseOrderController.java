package com.example.financeManagement.Finance.Controllers;


import com.example.financeManagement.Finance.mdbspringboot.model.PurchaseOrder;
import com.example.financeManagement.Finance.mdbspringboot.model.Vendor;
import com.example.financeManagement.Finance.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class PurchaseOrderController {

    private  final PurchaseOrderService purchaseOrderService;


    @Autowired
    public  PurchaseOrderController(PurchaseOrderService purchaseOrderService){
        this.purchaseOrderService = purchaseOrderService;
    }

    @GetMapping(path = "/purchase-order")
    public List<PurchaseOrder> getAllPurchaseOrders(){
        return purchaseOrderService.getPurchaseOrder();
    }

    @GetMapping(path = "/purchase-order/{id}")
    public ResponseEntity<Vendor> getVendorById(@PathVariable String id){
        Optional<Vendor> vendor = purchaseOrderService.getVendorById(id);
        return  vendor.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping(path = "/purchase-order/totalPurchases")
    public  double getTotalPurchases(){
        return purchaseOrderService.getTotalPurchases();
    }

    @PostMapping(path = "/purchase-order")
    public PurchaseOrder createPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder){
        return  purchaseOrderService.createPurchaseOrder(purchaseOrder);
    }
}
