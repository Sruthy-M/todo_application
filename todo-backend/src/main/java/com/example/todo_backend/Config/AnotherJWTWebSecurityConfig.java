package com.example.todo_backend.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AnotherJWTWebSecurityConfig {
    @Bean("configJWTWebSecurityConfig")
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // Configure HTTP security
        return http.build();
    }
}