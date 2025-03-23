package com.mvpsports.sportsApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Division")
public class Division {
    @Id
    @Column(name = "divisionID")
    private int divisionID;

    @Column(name = "divisionName")
    private String divisionName;

    public Division() {
    }

    public Division(int divisionID, String divisionName) {
        this.divisionID = divisionID;
        this.divisionName = divisionName;
    }

    public int getDivisionID() {
        return divisionID;
    }

    public void setDivisionID(int divisionID) {
        this.divisionID = divisionID;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    @Override
    public String toString() {
        return "Division{" +
                "divisionID=" + divisionID +
                ", divisionName='" + divisionName + '\'' +
                '}';
    }
}
