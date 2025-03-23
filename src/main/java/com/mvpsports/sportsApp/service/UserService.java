package com.mvpsports.sportsApp.service;

import com.mvpsports.sportsApp.entity.User;
import com.mvpsports.sportsApp.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JWTService jwtService;
    private BCryptPasswordEncoder bCryptPasswordEncoder =  new BCryptPasswordEncoder(12);

    @Transactional
    public User createUser(User user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
       return  userRepository.save(user);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public String verify(User user) {

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getName(), user.getPassword()));
        if (authentication.isAuthenticated()){
            return jwtService.genrateToken(user);
        }
        return "fail";
    }
}
