package com.mvpsports.sportsApp.controller.restControllers;

import com.mvpsports.sportsApp.entity.Leagues;
import com.mvpsports.sportsApp.service.LeaguesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class LeaguesController {
    @Autowired
    private LeaguesService leaguesService;


    @GetMapping("/leagues")
    public ResponseEntity<List<Leagues>> getAllLeagues(){

        return leaguesService.getAllLeagues();

    }
    @GetMapping("/leagues/{league_id}")
    public ResponseEntity<Leagues> getLeagueById(@PathVariable int league_id){
        return leaguesService.getLeagueById(league_id);
    }
    @PostMapping("/leagues")
    public ResponseEntity<Leagues> createLeague(@RequestBody Leagues leagues){
       return leaguesService.createLeague(leagues);
    }
}
