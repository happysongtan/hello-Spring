package com.example.hellospring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class FarmMember {

    private Integer id;
    private Integer userId;
    private Integer farmId;
    private LocalDateTime joinedAt;

    public FarmMember(Integer userId, Integer farmId) {
        this.userId = userId;
        this.farmId = farmId;
    }
}