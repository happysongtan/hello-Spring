package com.example.hellospring.dto.farm;

public record FarmMemberRequest(
        Integer userId,
        Integer farmId
) {
}
