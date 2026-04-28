package com.example.hellospring.dto.record;

public record CategoriesResponse (int id, int user_id, int category_id, int amount,
                                  String description, String memo, int record_data,
                                  int create_at){
}
