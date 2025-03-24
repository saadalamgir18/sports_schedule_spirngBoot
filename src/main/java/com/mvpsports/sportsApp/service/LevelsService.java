package com.mvpsports.sportsApp.service;

import com.mvpsports.sportsApp.entity.Levels;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LevelsService {
    ResponseEntity<List<Levels>> findAll();

    ResponseEntity<Levels> findLeveById(int levelId);

    ResponseEntity<Levels> createLevel(Levels levels);

    void deleteLevelById(int levelId);
}
