package com.example.hellospring.service;

import com.example.hellospring.dto.user.UserRequest;
import com.example.hellospring.dto.user.UserResponse;
import com.example.hellospring.entity.User;
import com.example.hellospring.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public List<UserResponse> getUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserResponse::new)
                .toList();
    }
    public UserResponse getUser(int id) {
        User user = userRepository.findById(id);
        return new UserResponse(user);
    }
    public void saveUser(UserRequest request) {
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
