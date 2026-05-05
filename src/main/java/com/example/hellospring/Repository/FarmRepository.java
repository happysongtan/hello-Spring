package com.example.hellospring.Repository;

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
    public List<FarmsResponse>findAllFarms(){
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
    public List<FarmsMemberResponse>findAllFarmsMembers(){
        String sql= """
                    SELECT id,user_id,farm_id,joined_at
                    FROM farms_members
                """;
        return jdbcTemplate.query(sql,(rs, rowNum) ->
                new FarmsMemberResponse(
                        rs.getInt("id"),
                        rs.getInt("user_id"),
                        rs.getInt("farm_id"),
                        rs.getTimestamp("joined_at").toLocalDateTime()
                )
        );

    }

}
