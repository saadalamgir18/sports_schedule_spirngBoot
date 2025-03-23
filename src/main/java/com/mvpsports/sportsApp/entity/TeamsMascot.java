package com.mvpsports.sportsApp.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TeamsMascot")
public class TeamsMascot {
    @Id
    @Column(name = "teamsMascotID")
    private int teamsMascotID;

    @Column(name = "teamsMascotName")
    private String teamsMascotName;

    public TeamsMascot() {
    }

    public TeamsMascot(int teamsMascotID, String teamsMascotName) {
        this.teamsMascotID = teamsMascotID;
        this.teamsMascotName = teamsMascotName;
    }

    public int getTeamsMascotID() {
        return teamsMascotID;
    }

    public void setTeamsMascotID(int teamsMascotID) {
        this.teamsMascotID = teamsMascotID;
    }

    public String getTeamsMascotName() {
        return teamsMascotName;
    }

    public void setTeamsMascotName(String teamsMascotName) {
        this.teamsMascotName = teamsMascotName;
    }

    @Override
    public String toString() {
        return "TeamsMascot{" +
                "teamsMascotID=" + teamsMascotID +
                ", teamsMascotName='" + teamsMascotName + '\'' +
                '}';
    }
}
