package com.example.login_system.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.processing.Generated;

@RestController
@RequestMapping("/api")
public class AdminController {
    @PreAuthorize("has a role('ADMIN')")
    @GetMapping("/admin")
    public ResponseEntity<String>helloAdmin(){
        return ResponseEntity.ok("hello Admin");
    }
    @PreAuthorize("has a role('USER')")
    @GetMapping("/user")
    public ResponseEntity<String>helloUser(){
        return ResponseEntity.ok("hello User");
    }


}
