package com.example.hellospring.controller;

import com.example.hellospring.dto.user.UserRequest;
import com.example.hellospring.entity.User;
import com.example.hellospring.repository.UserRepository;
import com.example.hellospring.dto.user.UserResponse;
import com.example.hellospring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public List<UserResponse> getUsers(){
        return userService.getUsers();
    }
    @GetMapping("/users/{id}")
    public UserResponse  getUser(@PathVariable int id)
    {
        return userService.getUser(id);
    }

    @PostMapping("/users")
    public void saveUser(@RequestBody UserRequest request) {
        userService.saveUser(request);
    }
}
