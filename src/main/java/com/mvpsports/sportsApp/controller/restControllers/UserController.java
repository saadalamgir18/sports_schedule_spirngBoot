package com.mvpsports.sportsApp.controller.restControllers;


import com.mvpsports.sportsApp.entity.User;
import com.mvpsports.sportsApp.service.UserService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> login(@RequestBody User user, HttpServletResponse response){
        System.out.println(user);
        String token  = userService.verify(user);

        if (token != null) {
            // Create a cookie with the token
            Cookie tokenCookie = new Cookie("token", token);
            tokenCookie.setHttpOnly(true); // Make the cookie HttpOnly for security
            tokenCookie.setMaxAge(60 * 60 * 24); // Set cookie expiration time (e.g., 1 day)
            tokenCookie.setPath("/"); // Set the path where the cookie is valid

            // Add the cookie to the response
            response.addCookie(tokenCookie);

            // Return a success response
            return new ResponseEntity<>(token, HttpStatus.OK);
        } else {
            // Return an error response if verification fails
            return new ResponseEntity<>("Invalid credentials", HttpStatus.UNAUTHORIZED);
        }
    }
}
