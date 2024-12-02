package org.example.healthdiaryproject.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public boolean login(String username, String password) {
        // Replace this with actual database logic
        return "user".equals(username) && "password".equals(password);
    }
}
