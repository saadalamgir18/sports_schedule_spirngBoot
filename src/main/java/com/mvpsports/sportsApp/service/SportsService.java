package com.mvpsports.sportsApp.service;

import com.mvpsports.sportsApp.entity.Sports;
import com.mvpsports.sportsApp.repository.SportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportsService {
    @Autowired
    SportsRepository sportsRepository;


    public ResponseEntity<Sports> createSport(Sports sports) {

        return  new ResponseEntity<>(sportsRepository.save(sports), HttpStatus.CREATED);
    }

    public ResponseEntity<List<Sports>> getSports() {
        return new ResponseEntity<>(sportsRepository.findAll(), HttpStatus.OK);
    }
}
