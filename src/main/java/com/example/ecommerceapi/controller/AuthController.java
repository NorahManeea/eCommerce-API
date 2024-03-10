package com.example.ecommerceapi.controller;

import com.example.ecommerceapi.entity.User;
import com.example.ecommerceapi.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User registeredUser = authService.registerUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity loginUser(@RequestBody User user) {
        try {
            String email = user.getEmail();
            String password = user.getPassword();

            if (email.isEmpty() || password.isEmpty()) {
                return ResponseEntity.badRequest().body("Email or password cannot be empty");
            }
            User loggedInUser = authService.loginUser(email, password);
            return ResponseEntity.ok().body(loggedInUser);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
        }
    }
}
