package com.example.hellospring.repository;

import com.example.hellospring.entity.Farm;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FarmRepository {
    private final JdbcTemplate jdbcTemplate;
    public List<Farm>findAll(){
        String sql= """
                    SELECT id,name,created_at
                    FROM farms
                """;
        return jdbcTemplate.query(sql,(rs, rowNum) ->
                new Farm(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getTimestamp("created_at").toLocalDateTime()

                )
        );

    }
    public void save(Farm farm) {
        String sql = """
            INSERT INTO farms(name)
            VALUES (?)
            """;

        jdbcTemplate.update(sql, farm.getName());
    }


}
