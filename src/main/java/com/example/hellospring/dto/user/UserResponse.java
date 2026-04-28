package com.example.hellospring.dto.user;

public record UserResponse(int id,String user_id, String user_password,String name,
                           int age, int current_pig_level, int monthly_income,
                           int target_expense_ratio, int created_at) {
}
