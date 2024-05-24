package com.example.login_system.controller;

import com.example.login_system.dto.LoginDto;
import com.example.login_system.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<String>login(@RequestBody LoginDto loginDto){
        String success = authService.login(loginDto);
        return new ResponseEntity<>(success, HttpStatus.OK);
    }
}
