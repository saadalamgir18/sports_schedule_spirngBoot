package com.mvpsports.sportsApp.service;

import com.mvpsports.sportsApp.entity.Leagues;
import com.mvpsports.sportsApp.repository.LeaguesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeaguesService {
    @Autowired
    private LeaguesRepository leaguesRepository;

    public ResponseEntity<List<Leagues>> getAllLeagues() {

            return new ResponseEntity<>(leaguesRepository.findAll(), HttpStatus.OK);

    }

    public ResponseEntity<Leagues> getLeagueById(int leagueId) {
        try {
            return new ResponseEntity(leaguesRepository.findById(leagueId), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Leagues> createLeague(Leagues leagues) {
       return new ResponseEntity<>(leaguesRepository.save(leagues), HttpStatus.CREATED) ;
    }
}
