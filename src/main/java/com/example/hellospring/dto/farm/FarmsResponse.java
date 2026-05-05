package com.example.hellospring.dto.farm;

import java.time.LocalDateTime;

public record FarmsResponse (int id, String name, LocalDateTime created_at){
}
