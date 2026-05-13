package com.example.hellospring.repository;

import com.example.hellospring.dto.record.MonthlyHistoryResponse;
import com.example.hellospring.entity.MonthlyHistory;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MonthlyHistoryRepository {
    private final JdbcTemplate jdbcTemplate;
    public List<MonthlyHistory> findAll(){
        String sql= """
                SELECT id,user_id,target_month,avg_ratio,house_level
                FROM monthly_history
                """;
        return jdbcTemplate.query(sql,(rs, rowNum) ->
                new MonthlyHistory(
                        rs.getInt("id"),
                        rs.getInt("user_id"),
                        rs.getString("target_month"),
                        rs.getFloat("avg_ratio"),
                        rs.getInt("house_level")
                )
        );

    }
}
