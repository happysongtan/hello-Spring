package com.example.hellospring.dto.record;
import java.time.LocalDateTime;
import com.example.hellospring.entity.Record;
public record RecordResponse (int id, int user_id, int category_id, int amount,
                              String description, String memo, LocalDateTime  record_date,
                              LocalDateTime created_at) {
    public RecordResponse(Record record) {
        this(
                record.getId(),
                record.getUserId(),
                record.getCategoryId(),
                record.getAmount(),
                record.getDescription(),
                record.getMemo(),
                record.getRecordDate(),
                record.getCreatedAt()
        );

    }
}
