package com.mvpsports.sportsApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CityState")
public class CityState {
    @Id
    @Column(name = "cityStateID", nullable = false)
    private int cityStateId;

    @Column(name = "cityStateName", nullable = false)
    private String cityStateName;
    public CityState(){}

    public CityState(int cityStateId, String cityStateName) {
        this.cityStateId = cityStateId;
        this.cityStateName = cityStateName;
    }

    public int getCityStateId() {
        return cityStateId;
    }

    public void setCityStateId(int cityStateId) {
        this.cityStateId = cityStateId;
    }

    public String getCityStateName() {
        return cityStateName;
    }

    public void setCityStateName(String cityStateName) {
        this.cityStateName = cityStateName;
    }

    @Override
    public String toString() {
        return "CityState{" +
                "cityStateId=" + cityStateId +
                ", cityStateName='" + cityStateName + '\'' +
                '}';
    }
}
