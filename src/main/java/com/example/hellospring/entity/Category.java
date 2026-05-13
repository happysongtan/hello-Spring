package com.example.hellospring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Category {
    private Integer id;
    private String name;
    private String icon;
    private String type;
}