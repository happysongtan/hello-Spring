package com.example.hellospring.dto.user;

import java.time.LocalDateTime;

public record UserResponse(int id, String user_Id, String name,
                           int age, int currentPigLevel, int monthlyIncome,
                           int targetExpenseRatio, LocalDateTime createdAt) {
}
