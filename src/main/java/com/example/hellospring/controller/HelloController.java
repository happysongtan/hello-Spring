package com.example.hellospring.controller;

import com.example.hellospring.dto.record.HelloResponseRecord;
import com.example.hellospring.dto.user.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @ResponseBody
    @GetMapping("/userd")
    public HelloResponseRecord recordHello(){
        return new HelloResponseRecord("halo",50);
    }
    @ResponseBody
    @GetMapping("/user")
    public UserResponse User(){
        return new UserResponse(4,"soonja","password",
                "luck", 20, 5, 3, 2000,
                20);
    }
}
