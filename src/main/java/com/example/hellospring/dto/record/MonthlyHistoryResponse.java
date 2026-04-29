package com.example.hellospring.dto.record;

public record MonthlyHistoryResponse (int id, int user_id,String target_month,float avg_ratio,
                                      int house_level){
}
