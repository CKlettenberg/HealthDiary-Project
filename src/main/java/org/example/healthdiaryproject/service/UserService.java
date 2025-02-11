package org.example.healthdiaryproject.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public boolean login(String username, String password) {
        return "user".equals(username) && "password".equals(password);
    }
}
