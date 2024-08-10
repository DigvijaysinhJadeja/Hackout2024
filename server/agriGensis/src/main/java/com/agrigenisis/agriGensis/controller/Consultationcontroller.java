package com.agrigenisis.agriGensis.controller;

import com.agrigenisis.agriGensis.model.Consultation;
import com.agrigenisis.agriGensis.repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

    @RestController
    public class Consultationcontroller {
        @Autowired
        private ConsultationRepository consultationRepository;

        @PostMapping("/Consultation")
        Consultation newConsultation(@RequestBody Consultation newconsultation) {
            return consultationRepository.save(newconsultation);
        }

        @GetMapping("/Consultations")
        List<Consultation> getAllFarmers() {
            return consultationRepository.findAll();
        }
    }
