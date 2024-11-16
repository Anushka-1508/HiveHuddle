package com.hivehuddle.controller;

import com.hivehuddle.model.User;
import com.hivehuddle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    UserService userService;
    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("hello")
    public String hello(){
        return "hello World";
    }

    @PostMapping("/register")
    public void registerUser(@RequestBody User user) throws Exception {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.addUser(user);
    }

}
