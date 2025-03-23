package com.mvpsports.sportsApp.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "sports")
public class Sports {
    @Id
    @Column(name = "sport_id", nullable = false)
    private int sportId;

    @Column(name = "sport_name")
    private String sportName;

    @OneToMany(mappedBy = "sports")
    private List<Leagues> leagues;



    public Sports(){}

    public Sports(int sportId, String sportName) {
        this.sportId = sportId;
        this.sportName = sportName;
    }

    public int getSportId() {
        return sportId;
    }

    public void setSportId(int sportId) {
        this.sportId = sportId;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public List<Leagues> getLeagues() {
        return leagues;
    }

    public void setLeagues(List<Leagues> leagues) {
        this.leagues = leagues;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "sportId=" + sportId +
                ", sportName='" + sportName + '\'' +
                '}';
    }
}
