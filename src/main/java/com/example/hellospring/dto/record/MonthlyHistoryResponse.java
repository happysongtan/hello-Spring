package com.example.hellospring.dto.record;

import com.example.hellospring.entity.MonthlyHistory;

public record MonthlyHistoryResponse (int id, int user_id, String target_month, float avg_ratio,
                                      int house_level){
    public MonthlyHistoryResponse(MonthlyHistory monthlyHistory) {
    this(
            monthlyHistory.getId(),
            monthlyHistory.getUserId(),
            monthlyHistory.getTarget_month(),
            monthlyHistory.getAvg_ratio(),
            monthlyHistory.getHouse_level()
    );
}
}
