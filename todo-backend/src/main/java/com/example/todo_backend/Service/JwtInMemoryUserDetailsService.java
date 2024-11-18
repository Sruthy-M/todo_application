package com.example.todo_backend.Service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Here, you can load the user from your database or other data source
        // For the sake of example, returning a hardcoded user
        if ("user".equals(username)) {
            return User.withUsername("user")
                    .password("{noop}password")  // {noop} is used for plain-text passwords, replace with proper encoding
                    .roles("USER")
                    .build();
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
