package com.mvpsports.sportsApp.controller.restControllers;

import com.mvpsports.sportsApp.entity.Levels;
import com.mvpsports.sportsApp.service.LevelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class LevelsController {
    @Autowired
    private LevelsService levelsService;


    @GetMapping("/levels")
    public List<Levels> getLevels(){
        return levelsService.findAll();
    }

}
