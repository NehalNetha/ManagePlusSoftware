package com.example.financeManagement.Finance.service;

import com.example.financeManagement.Finance.mdbspringboot.model.Inventory;
import com.example.financeManagement.Finance.repository.InventoryRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    private final InventoryRespository inventoryRespository;

    @Autowired
    public InventoryService(InventoryRespository inventoryRespository){
        this.inventoryRespository = inventoryRespository;
    }
    public List<Inventory> getAllInventory(){
       return inventoryRespository.findAll();
    }

    public Inventory createInventory(Inventory inventory){
        return inventoryRespository.save(inventory);
    }

    public  double getTotalInventory(){
        List<Inventory> inventories = getAllInventory();
        double totalInventory = 0;
        for(Inventory inventory: inventories){
            totalInventory += inventory.getTotal();
        }
        return totalInventory;
    }


}
