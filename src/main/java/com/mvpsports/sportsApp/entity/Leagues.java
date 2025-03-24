package com.mvpsports.sportsApp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "leagues")
public class Leagues {
    @Id
    @Column(name = "league_id", nullable = false)
    private int leagueId;

    @Column(name = "league_name")
    private String leagueName;


    @ManyToOne
    @JoinColumn(name = "sport_id")
    private Sports sports;

    @ManyToOne
    @JoinColumn(name = "level_id")
    private Levels levels;

    public Leagues() {
    }

    public Leagues(int leagueId, String leagueName) {
        this.leagueId = leagueId;
        this.leagueName = leagueName;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public Sports getSports() {
        return sports;
    }

    public void setSports(Sports sports) {
        this.sports = sports;
    }


    public Levels getLevels() {
        return levels;
    }

    public void setLevels(Levels levels) {
        this.levels = levels;
    }

    @Override
    public String toString() {
        return "Leagues{" +
                "leagueId=" + leagueId +
                ", leagueName='" + leagueName + '\'' +
                ", sports=" + sports +
                ", levels=" + levels +
                '}';
    }
}
