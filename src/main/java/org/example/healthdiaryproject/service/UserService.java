package org.example.healthdiaryproject.service;

import java.util.HashMap;


public class UserService {
    private HashMap<String, String> users;

    public UserService() {
        users = new HashMap<>();
        users.put("user1", "password1");
        users.put("admin", "admin123");
    }
    public boolean login(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }

    public boolean register(String username, String password) {
        if (users.containsKey(username)) {
            return false; // User already exists
        }
        users.put(username, password);
        return true; // Registration successful


        // add user - name , dateOfBirth (not required), age (? automaatne v käsitsi)

        // update user
        //   delete user

        // alerts?  ja nn kehatemp mõõtmiseks aeg, timer, stopper vms ? ? ?


    }
}