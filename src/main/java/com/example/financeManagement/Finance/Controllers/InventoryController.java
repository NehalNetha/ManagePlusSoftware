package com.example.financeManagement.Finance.Controllers;

import com.example.financeManagement.Finance.mdbspringboot.model.Inventory;
import com.example.financeManagement.Finance.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")

public class InventoryController {

    private final InventoryService inventoryService;

    @Autowired
    public  InventoryController(InventoryService inventoryService){
        this.inventoryService = inventoryService;
    }

    @GetMapping(path = "/inventory")
    public List<Inventory> getAllInventory(){
        return inventoryService.getAllInventory();
    }

    @GetMapping(path = "/inventory/totalInventory")
    public Double getTotalInventory(){
        return inventoryService.getTotalInventory();
    }

    @PostMapping(path = "/inventory")
    public Inventory createInventory(@RequestBody Inventory inventory){
        return inventoryService.createInventory(inventory);
    }
}
