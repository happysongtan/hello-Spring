package com.example.hellospring.controller;

import com.example.hellospring.repository.CategoryRepository;
import com.example.hellospring.repository.MonthlyHistoryRepository;
import com.example.hellospring.repository.RecordRepository;
import com.example.hellospring.dto.record.CategoriesResponse;
import com.example.hellospring.dto.record.MonthlyHistoryResponse;
import com.example.hellospring.dto.record.RecordResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RecordController {
    private final RecordRepository recordRepository;
    private final CategoryRepository categoryRepository;
    private final MonthlyHistoryRepository monthlyHistoryRepository;
    @GetMapping("/record")
    public List<RecordResponse> record(){
        return recordRepository.findAll();
    }
    @GetMapping("/category")
    public List<CategoriesResponse> Category(){
        return categoryRepository.findAll();
    }
    @GetMapping("/monthly")
    public List<MonthlyHistoryResponse> Monthly(){
        return monthlyHistoryRepository.findAll();
    }
}
