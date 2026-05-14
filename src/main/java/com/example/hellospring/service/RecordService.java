package com.example.hellospring.service;

import com.example.hellospring.dto.record.CategoriesResponse;
import com.example.hellospring.dto.record.MonthlyHistoryResponse;
import com.example.hellospring.dto.record.RecordRequest;
import com.example.hellospring.dto.record.RecordResponse;
import com.example.hellospring.repository.CategoryRepository;
import com.example.hellospring.repository.MonthlyHistoryRepository;
import com.example.hellospring.repository.RecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.hellospring.entity.Record;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecordService {
    private final RecordRepository recordRepository;
    private final CategoryRepository categoryRepository;
    private final MonthlyHistoryRepository monthlyHistoryRepository;

    public List<RecordResponse> getRecords() {
        return recordRepository.findAll()
                .stream()
                .map(RecordResponse::new)
                .toList();
    }
    public void saveRecord(RecordRequest request) {
        Record record = new Record(
                request.userId(),
                request.categoryId(),
                request.amount(),
                request.description(),
                request.memo(),
                request.recordDate()
        );

        recordRepository.save(record);
    }
    public List<CategoriesResponse> getCategories() {
        return categoryRepository.findAll()
                .stream()
                .map(CategoriesResponse::new)
                .toList();
    }

    public List<MonthlyHistoryResponse> getMonthlyHistories() {
        return monthlyHistoryRepository.findAll()
                .stream()
                .map(MonthlyHistoryResponse::new)
                .toList();
    }
}
