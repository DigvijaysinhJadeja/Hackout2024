package com.agrigenisis.agriGensis.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Consultant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String specialization;

    private String contact;

    private String bio;

    @OneToMany(mappedBy = "consultant")
    private List<Consultation> consultations;

    // Constructors
    public Consultant() {
    }

    public Consultant(String name, String specialization, String contact, String bio) {
        this.name = name;
        this.specialization = specialization;
        this.contact = contact;
        this.bio = bio;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<Consultation> getConsultations() {
        return consultations;
    }

    public void setConsultations(List<Consultation> consultations) {
        this.consultations = consultations;
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", contact='" + contact + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
}