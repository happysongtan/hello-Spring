package com.example.hellospring.repository;

import com.example.hellospring.dto.record.CategoriesResponse;
import com.example.hellospring.entity.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
public class CategoryRepository {
    private final JdbcTemplate jdbcTemplate;
    public List<Category> findAll(){
        String sql= """
                SELECT id, name, icon, type
                FROM categories
                """;
        return jdbcTemplate.query(sql,(rs, rowNum) ->
                new Category(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("icon"),
                        rs.getString("type")
                )
        );

    }
}
