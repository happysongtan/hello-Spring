package com.example.hellospring.repository;

import com.example.hellospring.dto.farm.FarmsMemberResponse;
import com.example.hellospring.dto.farm.FarmsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FarmRepository {
    private final JdbcTemplate jdbcTemplate;
    public List<FarmsResponse>findAll(){
        String sql= """
                    SELECT id,name,created_at
                    FROM farms
                """;
        return jdbcTemplate.query(sql,(rs, rowNum) ->
                new FarmsResponse(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getTimestamp("created_at").toLocalDateTime()

                )
        );

    }


}
