package com.example.financeManagement.Finance.service;

import com.example.financeManagement.Finance.mdbspringboot.model.Vendor;
import com.example.financeManagement.Finance.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {

    private final VendorRepository vendorRepository;

    @Autowired
    public VendorService(VendorRepository vendorRepository){
        this.vendorRepository = vendorRepository;
    }

    public List<Vendor> getAllVendors(){
        return vendorRepository.findAll();
    }


    public Vendor createVendor(Vendor vendor){return  vendorRepository.save(vendor);}


}
