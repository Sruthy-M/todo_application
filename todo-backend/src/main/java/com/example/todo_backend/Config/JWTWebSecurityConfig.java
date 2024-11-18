package com.example.todo_backend.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class JWTWebSecurityConfig  {

   
   @Bean("serviceJWTWebSecurityConfig")
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // Configure HTTP security
        return http.build();
    }
}
