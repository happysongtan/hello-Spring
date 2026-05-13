package com.example.hellospring.repository;

import com.example.hellospring.dto.record.CategoriesResponse;
import com.example.hellospring.dto.record.MonthlyHistoryResponse;
import com.example.hellospring.dto.record.RecordResponse;
import com.example.hellospring.entity.Record;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class RecordRepository {
    private final JdbcTemplate jdbcTemplate;
    public List<Record>findAll() {
        String sql = """
                SELECT id,user_id,category_id,amount,description,
                memo,record_date,created_at
                FROM records
                """;
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Record(
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
    public void save(Record record) {
        String sql = """
                INSERT INTO records(
                    user_id,
                    category_id,
                    amount,
                    description,
                    memo,
                    record_date
                )
                VALUES (?, ?, ?, ?, ?, ?)
                """;

        jdbcTemplate.update(
                sql,
                record.getUserId(),
                record.getCategoryId(),
                record.getAmount(),
                record.getDescription(),
                record.getMemo(),
                record.getRecordDate()
        );
    }

}
