package com.example.hellospring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Farm {
    private Integer id;
    private String name;
    private LocalDateTime createdAt;

    public Farm(String name) {
        this.name = name;
    }
}