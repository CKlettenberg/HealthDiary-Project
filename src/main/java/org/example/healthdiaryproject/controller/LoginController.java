package org.example.healthdiaryproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@CrossOrigin 
public class LoginController {
    @PostMapping
    public ResponseEntity<String> login(@RequestBody UserLoginRequest request) {

       
        return ResponseEntity.ok("Login successful!");
    }
}
