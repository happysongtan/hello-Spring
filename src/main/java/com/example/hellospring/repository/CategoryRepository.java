package com.example.hellospring.repository;

import com.example.hellospring.dto.record.CategoriesResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
public class CategoryRepository {
    private final JdbcTemplate jdbcTemplate;
    public List<CategoriesResponse> findAll(){
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
}
