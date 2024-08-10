package com.agrigenisis.agriGensis.controller;

import com.agrigenisis.agriGensis.model.Farmer;
import com.agrigenisis.agriGensis.repository.FarmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class Farmercontroller {

    @Autowired
    private FarmerRepository farmerRepository;

    @PostMapping("/Farmer")
    Farmer newFarmer(@RequestBody Farmer newfarmer) {
        return farmerRepository.save(newfarmer);
    }

    @GetMapping("/Farmers")
    List<Farmer> getAllFarmers() {
        return farmerRepository.findAll();
    }
}
