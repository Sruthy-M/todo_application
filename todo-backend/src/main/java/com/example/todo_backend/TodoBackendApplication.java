package com.example.todo_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@ComponentScan("com.example.todo_backend")
@EnableJpaRepositories("com.example.todo_backend.Repository")
@EntityScan("com.example.todo_backend.Model")
@ComponentScan(basePackages = "com.example.todo_backend.Config") // Ensure it only scans Config, or relevant packages
public class TodoBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoBackendApplication.class, args);
    }
}
