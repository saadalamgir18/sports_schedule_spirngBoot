package com.mvpsports.sportsApp.controller.restControllers;

import com.mvpsports.sportsApp.entity.Sports;
import com.mvpsports.sportsApp.service.SportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SportsController {
    @Autowired
    private SportsService sportsService;

    @PostMapping("/sports")
    public ResponseEntity<Sports> createSport(@RequestBody Sports sports){
        return sportsService.createSport(sports);

    }
    @GetMapping("/sports")
    public ResponseEntity<List<Sports>> geteSports(){
        return sportsService.getSports();

    }
}
