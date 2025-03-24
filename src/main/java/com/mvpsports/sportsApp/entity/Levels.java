package com.mvpsports.sportsApp.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Levels")
public class Levels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "level_id")
    private int leveId;


    @Column(name = "level_name")
    private String levelName;


//    @OneToMany(mappedBy = "levels")
//    private List<Leagues> leagues;


    public Levels() {
    }

    public Levels(int leveId, String levelName) {
        this.leveId = leveId;
        this.levelName = levelName;
    }

    public int getLeveId() {
        return leveId;
    }

    public void setLeveId(int leveId) {
        this.leveId = leveId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }


//    public List<Leagues> getLeagues() {
//        return leagues;
//    }
//
//    public void setLeagues(List<Leagues> leagues) {
//        this.leagues = leagues;
//    }

    @Override
    public String toString() {
        return "Levels{" +
                "leveId=" + leveId +
                ", levelName='" + levelName + '\'' +
                '}';
    }
}
