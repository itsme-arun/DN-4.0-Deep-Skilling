package org.helloworld.controller;

import org.helloworld.model.AuthRequest;
import org.helloworld.model.AuthResponse;
import org.helloworld.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired private AuthenticationManager authManager;
    @Autowired private JwtUtil jwtUtil;

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        try {
            Authentication authentication = authManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getUsername(), request.getPassword())
            );
            String token = jwtUtil.generateToken(authentication.getName());
            return new AuthResponse(token);
        } catch (AuthenticationException ex) {
            throw new RuntimeException("Invalid credentials");
        }
    }
}

