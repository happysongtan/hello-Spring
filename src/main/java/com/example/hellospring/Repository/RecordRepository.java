package com.example.hellospring.Repository;

import com.example.hellospring.dto.record.CategoriesResponse;
import com.example.hellospring.dto.record.MonthlyHistoryResponse;
import com.example.hellospring.dto.record.RecordResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class RecordRepository {
    private final JdbcTemplate jdbcTemplate;
    public List<RecordResponse>findRecordAll(){
        String sql= """
                SELECT id,user_id,category_id,amount,description,
                memo,record_date,created_at
                FROM records
                """;
        return jdbcTemplate.query(sql,(rs, rowNum) ->
                new RecordResponse(
                        rs.getInt("id"),
                        rs.getInt("user_id"),
                        rs.getInt("category_id"),
                        rs.getInt("amount"),
                        rs.getString("description"),
                        rs.getString("memo"),
                        rs.getTimestamp("record_date").toLocalDateTime(),
                        rs.getTimestamp("created_at").toLocalDateTime()
                )
        );

    }
    public List<CategoriesResponse>findCategoriesAll(){
        String sql= """
                SELECT id, name, icon, type
                FROM categories
                """;
        return jdbcTemplate.query(sql,(rs, rowNum) ->
                new CategoriesResponse(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("icon"),
                        rs.getString("type")
                )
        );

    }
    public List<MonthlyHistoryResponse>findMonthlyHistoryAll(){
        String sql= """
                SELECT id,user_id,target_month,avg_ratio,house_level
                FROM monthly_history
                """;
        return jdbcTemplate.query(sql,(rs, rowNum) ->
                new MonthlyHistoryResponse(
                        rs.getInt("id"),
                        rs.getInt("user_id"),
                        rs.getString("target_month"),
                        rs.getFloat("avg_ratio"),
                        rs.getInt("house_level")
                )
        );

    }
}
