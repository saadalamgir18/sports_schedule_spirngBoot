package com.mvpsports.sportsApp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Teams")
public class Teams {
    @Id
    @Column(name = "teamID", nullable = false)
    private String teamId;

    @Column(name = "teamName")
    private String teamName;

    @OneToOne
    @JoinColumn(name = "teamsAbbrevID")
    private TeamsAbbrev teamsAbbrev;

    @OneToOne
    @JoinColumn(name = "cityStateID")
    private CityState cityState;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "stateID")
    private State state;

    @OneToOne
    @JoinColumn(name = "teamsMascotID")
    private TeamsMascot teamsMascot;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "league_id")
    private Leagues leagues;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "divisionID")
    private Division division;



}
