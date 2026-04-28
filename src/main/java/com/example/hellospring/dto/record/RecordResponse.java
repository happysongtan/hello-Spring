package com.example.hellospring.dto.record;

public record RecordResponse (int id,int user_id, int category_id, int amount,
                              String description, String memo, int record_date,
                              int created_at) {
}
