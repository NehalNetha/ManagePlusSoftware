package com.example.financeManagement.Finance.Controllers;

import com.example.financeManagement.Finance.mdbspringboot.model.Vendor;
import com.example.financeManagement.Finance.service.EmployeeService;
import com.example.financeManagement.Finance.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class VendorController {
    private final VendorService vendorService;

    @Autowired
    public VendorController(VendorService vendorService){
        this.vendorService = vendorService;
    }

    @GetMapping(path = "/vendors")
    public List<Vendor> getAllVendors(){
        return vendorService.getAllVendors();
    }

    @PostMapping(path = "/vendors")
    public Vendor createEmployee(@RequestBody Vendor  vendor){
        return vendorService.createVendor(vendor);
    }
}
