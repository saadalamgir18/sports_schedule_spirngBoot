package com.mvpsports.sportsApp.service;

import com.mvpsports.sportsApp.entity.Levels;
import com.mvpsports.sportsApp.repository.LevelsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LevelServiceImpl implements LevelsService {
    @Autowired
    private LevelsRepository levelsRepository;
    @Override
    public ResponseEntity<List<Levels>> findAll() {

        return new ResponseEntity<>(levelsRepository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Levels> findLeveById(int levelId) {
        return new ResponseEntity(levelsRepository.findById(levelId), HttpStatus.OK);
    }

    @Override
    @Transactional
    public ResponseEntity<Levels> createLevel(Levels levels) {
        return  new ResponseEntity<>(levelsRepository.save(levels), HttpStatus.CREATED);
    }

    @Override
    public void deleteLevelById(int levelId) {
        levelsRepository.deleteById(levelId) ;
    }
}
