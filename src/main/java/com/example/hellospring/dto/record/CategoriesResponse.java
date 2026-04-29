package com.example.hellospring.dto.record;
import java.time.LocalDateTime;

public record CategoriesResponse (int id, int user_id, int category_id, int amount,
                                  String description, String memo, int  record_data,
                                  LocalDateTime create_at){
}
