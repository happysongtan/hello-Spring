package com.example.hellospring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class User {
    private int id;
    private String userId;
    private String name;
    private int age;
    private int currentPigLevel;
    private int monthlyIncome;
    private int targetExpenseRatio;
    private LocalDateTime createdAt;
}
