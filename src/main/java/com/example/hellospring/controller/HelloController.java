package com.example.hellospring.controller;

import com.example.hellospring.dto.HelloResponse;
import com.example.hellospring.dto.HelloResponseLB;
import com.example.hellospring.dto.HelloResponseRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("")
    @ResponseBody
    public HelloResponse hello(){
        return new HelloResponse("hello",20);
    }

    @GetMapping("/Lombok")
    @ResponseBody
    public HelloResponseLB lombokhello(){
        return new HelloResponseLB("hello",20);
    }

    @GetMapping("/record")
    public HelloResponseRecord recordHello(){
        return new HelloResponseRecord("halo",50);
    }
}
