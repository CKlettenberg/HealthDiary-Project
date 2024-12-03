package org.example.healthdiaryproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@CrossOrigin // Allow Vue frontend
public class LoginController {
    @PostMapping
    public ResponseEntity<String> login(@RequestBody UserLoginRequest request) {

        // Your login logic
        return ResponseEntity.ok("Login successful!");
    }
}
