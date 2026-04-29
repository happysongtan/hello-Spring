package com.example.hellospring.controller;

import com.example.hellospring.dto.user.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
@RestController
public class UserController {
    @GetMapping("/user")
    public List<UserResponse> user(){
        return List.of(
                new UserResponse(
                1,
                "piglet01",
                "encoded-password-1",
                "김하나",
                27,
                5,
                3200000,
                60,
                LocalDateTime.of(2026, 4, 29, 12, 30)
                ),

                new UserResponse(
                        2,
                        "piglet02",
                        "encoded-password-2",
                        "김둘",
                        28,
                        5,
                        3200000,
                        60,
                        LocalDateTime.of(2026, 4, 29, 12, 30)
                )
    );
    }
}
