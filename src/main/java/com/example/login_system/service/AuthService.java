package com.example.login_system.service;

import com.example.login_system.dto.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
