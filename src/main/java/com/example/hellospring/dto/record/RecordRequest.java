package com.example.hellospring.dto.record;

import java.time.LocalDateTime;

public record RecordRequest(
        int userId,
        int categoryId,
        int amount,
        String description,
        String memo,
        LocalDateTime recordDate
) {
}