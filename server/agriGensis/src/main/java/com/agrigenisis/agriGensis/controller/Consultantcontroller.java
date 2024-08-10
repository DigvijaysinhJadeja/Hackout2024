package com.agrigenisis.agriGensis.controller;

import com.agrigenisis.agriGensis.model.Consultant;
import com.agrigenisis.agriGensis.repository.ConsultantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class Consultantcontroller {

    @Autowired
    private ConsultantRepository consultantRepository;

    @PostMapping("/Consultant")
    Consultant newConsultant(@RequestBody Consultant newconsultant) {
        return consultantRepository.save(newconsultant);
    }

    @GetMapping("/Consultants")
    List<Consultant> getAllFarmers() {
        return consultantRepository.findAll();
    }
}
