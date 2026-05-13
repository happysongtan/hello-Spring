package com.example.hellospring.dto.user;

public record UserRequest(
        String userId,
        String userPassword,
        String name,
        int age,
        int currentPigLevel,
        int monthlyIncome,
        int targetExpenseRatio
) {
}
