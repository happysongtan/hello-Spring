package com.example.hellospring.controller;

import com.example.hellospring.dto.record.CategoriesResponse;
import com.example.hellospring.dto.record.MonthlyHistoryResponse;
import com.example.hellospring.dto.record.RecordResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {
    @GetMapping("/record")
    public RecordResponse record(){
        return new RecordResponse(2,3,3, 2000,
         "description",  "memo",2020,
        2030);
    }
    @GetMapping("/category")
    public CategoriesResponse Category(){
        return new CategoriesResponse( 2,3 , 2, 5,
        "description","memo", 23,
        23);
    }
    @GetMapping("/monthly")
    public MonthlyHistoryResponse Monthly(){
        return new MonthlyHistoryResponse( 2,2020,"20.9f",
        23,4);
    }
}
