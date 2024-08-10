package com.agrigenisis.agriGensis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.*;

@Entity
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Consultant consultant;

    @ManyToOne
    private Farmer farmer;

    private Date scheduledTime;

    private String status;

    private String notes;

    // Constructors
    public Consultation() {
    }

    public Consultation(Consultant consultant, Farmer farmer, Date scheduledTime, String status, String notes) {
        this.consultant = consultant;
        this.farmer = farmer;
        this.scheduledTime = scheduledTime;
        this.status = status;
        this.notes = notes;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Consultant getConsultant() {
        return consultant;
    }

    public void setConsultant(Consultant consultant) {
        this.consultant = consultant;
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public Date getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Date scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "id=" + id +
                ", consultant=" + consultant +
                ", farmer=" + farmer +
                ", scheduledTime=" + scheduledTime +
                ", status='" + status + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}