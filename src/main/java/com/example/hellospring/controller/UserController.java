package com.example.hellospring.controller;

import com.example.hellospring.Repository.UserRepository;
import com.example.hellospring.dto.user.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;
    @GetMapping("/users")
    public List<UserResponse> getUsers(){
        return userRepository.findAll();

    }
    @GetMapping("/users/{id}")
    public UserResponse getUser(@PathVariable int id){
        return userRepository.findById(id);
    }
}
