package com.example.hellospring.controller;

import com.example.hellospring.dto.record.CategoriesResponse;
import com.example.hellospring.dto.record.MonthlyHistoryResponse;
import com.example.hellospring.dto.record.RecordResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class RecordController {
    @GetMapping("/record")
    public List<RecordResponse> record(){
        return List.of(
                new RecordResponse(
                        2,3,3, 2000,
                        "description",  "memo", LocalDateTime.of(2026, 4, 29, 12, 30),
                        LocalDateTime.of(2026, 4, 29, 12, 30)
                )
        );
    }

    @GetMapping("/category")
    public List<CategoriesResponse> Category(){
        return List.of(
                new CategoriesResponse(
                        2,3 , 2, 5,
                        "description","memo", 23,
                        LocalDateTime.of(2026, 4, 29, 12, 30)
                )
        );
    }

    @GetMapping("/monthly")
    public List<MonthlyHistoryResponse> Monthly(){
        return List.of(
                new MonthlyHistoryResponse(
                        2,2020,"20.9f",
                        23,4
                )
        );
    }
}
