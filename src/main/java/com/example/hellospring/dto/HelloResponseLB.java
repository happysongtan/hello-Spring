package com.example.hellospring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class HelloResponseLB {
    private String message;
    private int age;
}
