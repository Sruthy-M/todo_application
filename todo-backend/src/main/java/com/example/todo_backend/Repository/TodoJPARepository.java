package com.example.todo_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.todo_backend.Model.Todo;

import java.util.List;

@Repository
public interface TodoJPARepository extends JpaRepository<Todo, Long> {
    List<Todo> findByUsername(String username);
}