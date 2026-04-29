package com.example.hellospring.dto.record;
import java.time.LocalDateTime;

public record RecordResponse (int id, int user_id, int category_id, int amount,
                              String description, String memo, LocalDateTime  record_date,
                              LocalDateTime created_at) {
}
