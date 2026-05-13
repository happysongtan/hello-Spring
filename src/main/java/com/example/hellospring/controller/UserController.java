package com.example.hellospring.controller;

import com.example.hellospring.dto.user.UserRequest;
import com.example.hellospring.entity.User;
import com.example.hellospring.repository.UserRepository;
import com.example.hellospring.dto.user.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;
    @GetMapping("/users")
    public List<UserResponse> getUsers(){
        return userRepository.findAll()
                .stream()
                .map(UserResponse::new)
                .toList();
    }
    @GetMapping("/users/{id}")
    public UserResponse  getUser(@PathVariable int id)
    {
        User user = userRepository.findById(id);
        return new UserResponse(user);
    }

    @PostMapping("/users")
    public void saveUser(@RequestBody UserRequest request) {
        User user = new User(
                request.userId(),
                request.userPassword(),
                request.name(),
                request.age(),
                request.currentPigLevel(),
                request.monthlyIncome(),
                request.targetExpenseRatio()
        );

        userRepository.save(user);
    }
}
