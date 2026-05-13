package com.example.hellospring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class MonthlyHistory {

    private int id;
    private int userId;
    private String target_month;
    private float avg_ratio;
    private Integer house_level;
}