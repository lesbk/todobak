package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entity.Todo;

@Repository
@CrossOrigin("*")
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
