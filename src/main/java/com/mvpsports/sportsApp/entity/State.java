package com.mvpsports.sportsApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "state")
public class State {
    @Id
    @Column(name = "stateID")
    private int stateID;

    @Column(name = "stateName")
    private String stateName;

    @Column(name = "stateRestriction")
    private String stateRestriction;

    public State() {
    }

    public State(int stateID, String stateName, String stateRestriction) {
        this.stateID = stateID;
        this.stateName = stateName;
        this.stateRestriction = stateRestriction;
    }

    public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateRestriction() {
        return stateRestriction;
    }

    public void setStateRestriction(String stateRestriction) {
        this.stateRestriction = stateRestriction;
    }
}
