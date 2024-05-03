package com.example.financeManagement.Finance.service;

import com.example.financeManagement.Finance.mdbspringboot.model.PurchaseOrder;
import com.example.financeManagement.Finance.mdbspringboot.model.Vendor;
import com.example.financeManagement.Finance.repository.PurchaseOrderRepository;
import com.example.financeManagement.Finance.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseOrderService {
    private  final PurchaseOrderRepository purchaseOrderRepository;
    private  final VendorRepository vendorRepository;

    @Autowired
    public PurchaseOrderService(PurchaseOrderRepository purchaseOrderRepository, VendorRepository vendorRepository){
        this.purchaseOrderRepository = purchaseOrderRepository;
        this.vendorRepository = vendorRepository;
    }

    public List<PurchaseOrder> getPurchaseOrder(){
        return purchaseOrderRepository.findAll();
    }

    public PurchaseOrder createPurchaseOrder(PurchaseOrder purchaseOrder){
        return  purchaseOrderRepository.save(purchaseOrder);
    }

    public Optional<Vendor>  getVendorById(String id){
        return  vendorRepository.findById(id);
    }

    public double getTotalPurchases(){
        List<PurchaseOrder> purchases = getPurchaseOrder();
        double totalPurchases = 0;
        for(PurchaseOrder purchaseOrder: purchases){
            totalPurchases += purchaseOrder.getTotal();
        }
        return  totalPurchases;
    }

}
