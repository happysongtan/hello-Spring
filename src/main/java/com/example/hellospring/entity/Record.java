package com.example.hellospring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Record {
    private int id;
    private int userId;
    private int categoryId;
    private int amount;
    private String description;
    private String memo;
    private LocalDateTime recordDate;
    private LocalDateTime createdAt;
    public Record(int userId, int categoryId, int amount, String description,
                  String memo, LocalDateTime recordDate) {
        this.userId = userId;
        this.categoryId = categoryId;
        this.amount = amount;
        this.description = description;
        this.memo = memo;
        this.recordDate = recordDate;
    }
}
