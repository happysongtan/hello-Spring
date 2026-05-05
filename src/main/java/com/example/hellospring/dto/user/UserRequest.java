package com.example.hellospring.dto.user;

public record UserRequest(
        String user_id,
        String user_password,
        String name,
        int age
) {
}
