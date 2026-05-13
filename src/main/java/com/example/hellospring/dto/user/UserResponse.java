package com.example.hellospring.dto.user;

import com.example.hellospring.entity.User;

import java.time.LocalDateTime;

public record UserResponse(int id, String user_Id, String name,
                           int age, int currentPigLevel, int monthlyIncome,
                           int targetExpenseRatio, LocalDateTime createdAt) {
    public UserResponse(User user) {
        this(
                user.getId(),
                user.getUserId(),
                user.getName(),
                user.getAge(),
                user.getCurrentPigLevel(),
                user.getMonthlyIncome(),
                user.getTargetExpenseRatio(),
                user.getCreatedAt()
        );
    }
}
