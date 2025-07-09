package com.spring.rest.mavenSetup.service;


import com.spring.rest.mavenSetup.model.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
    private final List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User(1, "Arun R", "arun@example.com"));
        users.add(new User(2, "Raj", "raj@example.com"));
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserById(int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }
}
