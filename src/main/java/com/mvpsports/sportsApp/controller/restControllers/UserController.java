package com.mvpsports.sportsApp.controller.restControllers;


import com.mvpsports.sportsApp.entity.User;
import com.mvpsports.sportsApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    UserService userService;



    @PostMapping("/register")
    public User createUser(@RequestBody User user){

        return userService.createUser(user);

    }


    @GetMapping("/users")
    public List<User> getUsers(){

        return userService.getUsers();
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
        System.out.println(user);
        return userService.verify(user);
    }
}
