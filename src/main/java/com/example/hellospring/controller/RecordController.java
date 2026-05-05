package com.example.hellospring.controller;

import com.example.hellospring.Repository.RecordRepository;
import com.example.hellospring.dto.record.CategoriesResponse;
import com.example.hellospring.dto.record.MonthlyHistoryResponse;
import com.example.hellospring.dto.record.RecordResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class RecordController {
    private final RecordRepository recordRepository;
    @GetMapping("/record")
    public List<RecordResponse> record(){
        return recordRepository.findRecordAll();
    }
    @GetMapping("/category")
    public List<CategoriesResponse> Category(){
        return recordRepository.findCategoriesAll();
    }
    @GetMapping("/monthly")
    public List<MonthlyHistoryResponse> Monthly(){
        return recordRepository.findMonthlyHistoryAll();
    }
}
