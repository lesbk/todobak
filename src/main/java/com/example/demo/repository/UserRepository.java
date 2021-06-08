package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entity.User;

@Repository
@CrossOrigin("*")
public interface UserRepository extends CrudRepository<User, Long> {

}
