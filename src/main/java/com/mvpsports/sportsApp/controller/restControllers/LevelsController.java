package com.mvpsports.sportsApp.controller.restControllers;

import com.mvpsports.sportsApp.entity.Levels;
import com.mvpsports.sportsApp.service.LevelsService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class LevelsController {
    @Autowired
    private LevelsService levelsService;


    @GetMapping("/levels")
    public ResponseEntity<List<Levels>>getLevels(){
        return levelsService.findAll();
    }

    @GetMapping("/levels/{level_id}")
    public ResponseEntity<Levels> getLevelById(@PathVariable int level_id){
        return levelsService.findLeveById(level_id);
    }

    @DeleteMapping("/levels/{level_id}")
    public void deleteLevelById(@PathVariable int level_id){
        levelsService.deleteLevelById(level_id);
    }


    @PostMapping("/levels")
    public ResponseEntity<Levels> createLevel(@RequestBody Levels levels, HttpServletRequest httpRequest){
        System.out.println(httpRequest.getHeader("Authorization"));

        return levelsService.createLevel(levels);

    }


}
