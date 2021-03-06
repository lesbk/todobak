package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Todo;
import com.example.demo.repository.TodoRepository;


@RestController
@RequestMapping("api/todo/")
@CrossOrigin("*")
public class TodoController {
	
	@Autowired
	TodoRepository todos;
	

}
