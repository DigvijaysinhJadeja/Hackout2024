package com.agrigenisis.agriGensis.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Farmer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private double farmSize;

    private String location;

    private String contact;

    @OneToMany(mappedBy = "farmer",cascade = CascadeType.ALL)
    private List<Crop> crops;
    // Constructors
    public Farmer() {
    }

    public Farmer(String name, double farmSize, String location, String contact, List<Crop> crops) {
        this.name = name;
        this.farmSize = farmSize;
        this.location = location;
        this.contact = contact;
        this.crops = crops;
    }

    // Getters and Setters
    public long getId() {
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

    public double getFarmSize() {
        return farmSize;
    }

    public void setFarmSize(double farmSize) {
        this.farmSize = farmSize;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", farmSize=" + farmSize +
                ", location='" + location + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
