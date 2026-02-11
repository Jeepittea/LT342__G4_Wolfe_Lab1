package com.example.miniapp.controller;

import com.example.miniapp.dto.LoginRequest;
import com.example.miniapp.dto.RegisterRequest;
import com.example.miniapp.model.User;
import com.example.miniapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*") // allow React / frontend to call this API
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    // ✅ REGISTER
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        // check if username already exists
        Optional<User> existing = userRepository.findByUsername(request.getUsername());
        if (existing.isPresent()) {
            return ResponseEntity.badRequest().body("Username already exists");
        }

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword()); // ⚠️ plain text for now (we'll hash later)

        userRepository.save(user);

        return ResponseEntity.ok("User registered successfully");
    }

    // ✅ LOGIN
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        Optional<User> userOpt = userRepository.findByUsername(request.getUsername());

        if (userOpt.isEmpty()) {
            return ResponseEntity.status(401).body("Invalid username or password");
        }

        User user = userOpt.get();

        if (!user.getPassword().equals(request.getPassword())) {
            return ResponseEntity.status(401).body("Invalid username or password");
        }

        return ResponseEntity.ok("Login successful");
    }
}
