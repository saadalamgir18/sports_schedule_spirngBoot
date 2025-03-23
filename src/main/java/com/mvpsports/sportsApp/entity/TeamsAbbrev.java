package com.mvpsports.sportsApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TeamsAbbrev")
public class TeamsAbbrev {
    @Id
    @Column(name = "teamsAbbrevID")
    private int teamsAbbrevId;

    @Column(name = "teamsAbbrevName")
    private String teamsAbbrevName;

    public TeamsAbbrev(){}

    public TeamsAbbrev(int teamsAbbrevId, String teamsAbbrevName) {
        this.teamsAbbrevId = teamsAbbrevId;
        this.teamsAbbrevName = teamsAbbrevName;
    }

    public int getTeamsAbbrevId() {
        return teamsAbbrevId;
    }

    public void setTeamsAbbrevId(int teamsAbbrevId) {
        this.teamsAbbrevId = teamsAbbrevId;
    }

    public String getTeamsAbbrevName() {
        return teamsAbbrevName;
    }

    public void setTeamsAbbrevName(String teamsAbbrevName) {
        this.teamsAbbrevName = teamsAbbrevName;
    }

    @Override
    public String toString() {
        return "TeamsAbbrev{" +
                "teamsAbbrevId=" + teamsAbbrevId +
                ", teamsAbbrevName='" + teamsAbbrevName + '\'' +
                '}';
    }
}
