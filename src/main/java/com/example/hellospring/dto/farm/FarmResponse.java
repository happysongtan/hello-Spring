package com.example.hellospring.dto.farm;

import com.example.hellospring.entity.Farm;

import java.time.LocalDateTime;

public record FarmResponse(int id, String name, LocalDateTime created_at){
    public FarmResponse(Farm farm){
        this(
                farm.getId(),
                farm.getName(),
                farm.getCreatedAt()
        );
    }

}
