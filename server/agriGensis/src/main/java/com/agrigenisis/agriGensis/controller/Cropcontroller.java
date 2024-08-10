package com.agrigenisis.agriGensis.controller;

import com.agrigenisis.agriGensis.model.Crop;
import com.agrigenisis.agriGensis.repository.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class Cropcontroller {

    @Autowired
    private CropRepository cropRepository;

    @PostMapping("/Crop")
    Crop newFarmer(@RequestBody Crop newcrop) {
        return cropRepository.save(newcrop);
    }

    @GetMapping("/Crops")
    List<Crop> getAllFarmers() {
        return cropRepository.findAll();
    }
}
