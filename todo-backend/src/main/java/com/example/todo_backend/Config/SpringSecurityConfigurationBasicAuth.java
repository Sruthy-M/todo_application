package com.example.todo_backend.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SpringSecurityConfigurationBasicAuth {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Disable CSRF for simplicity, not recommended for production
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll() // Allow pre-flight requests
                .anyRequest().authenticated() // All other requests must be authenticated
            )
            .httpBasic(); // Use Basic Authentication

        return http.build();
    }
}
