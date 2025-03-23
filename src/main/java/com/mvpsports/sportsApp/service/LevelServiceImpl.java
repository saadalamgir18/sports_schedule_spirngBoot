package com.mvpsports.sportsApp.service;

import com.mvpsports.sportsApp.entity.Levels;
import com.mvpsports.sportsApp.repository.LevelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LevelServiceImpl implements LevelsService {
    @Autowired
    private LevelsRepository levelsRepository;
    @Override
    public List<Levels> findAll() {

        return levelsRepository.findAll();
    }
}
