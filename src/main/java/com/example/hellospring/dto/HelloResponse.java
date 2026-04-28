package com.example.hellospring.dto;

public class HelloResponse {
    private String message;
    private int age;
    public HelloResponse(String message, int age){
        this.message=message;
        this.age=age;
    }
    public String getMessage() {
        return message;
    }
    public int getAge() {
        return age;
    }

}
