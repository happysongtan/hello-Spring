package com.example.hellospring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class User {
    private int id;
    private String userId;
    private String userPassword;
    private String name;
    private int age;
    private int currentPigLevel;
    private int monthlyIncome;
    private int targetExpenseRatio;
    private LocalDateTime createdAt;

    public User(String userId,String userPassword,String name, int age, int currentPigLevel,
                int monthlyIncome, int targetExpenseRatio) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.name = name;
        this.age = age;
        this.currentPigLevel = currentPigLevel;
        this.monthlyIncome = monthlyIncome;
        this.targetExpenseRatio = targetExpenseRatio;
    }

    public User(int id, String userId, String name, int age, int currentPigLevel,
                int monthlyIncome, int targetExpenseRatio, LocalDateTime createdAt) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.currentPigLevel = currentPigLevel;
        this.monthlyIncome = monthlyIncome;
        this.targetExpenseRatio = targetExpenseRatio;
        this.createdAt = createdAt;
    }
}
