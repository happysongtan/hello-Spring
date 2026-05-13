package com.example.hellospring.repository;

import com.example.hellospring.entity.FarmMember;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@RequiredArgsConstructor
@Repository
public class FarmMemberRepository {

    private final JdbcTemplate jdbcTemplate;
    public List<FarmMember> findAll(){
        String sql= """
                    SELECT id,user_id,farm_id,joined_at
                    FROM farms_members
                """;
        return jdbcTemplate.query(sql,(rs, rowNum) ->
                new FarmMember(
                        rs.getInt("id"),
                        rs.getInt("user_id"),
                        rs.getInt("farm_id"),
                        rs.getTimestamp("joined_at").toLocalDateTime()
                )
        );

    }
    public void save(FarmMember farmMember) {
        String sql = """
            INSERT INTO farms_members(user_id, farm_id)
            VALUES (?, ?)
            """;

        jdbcTemplate.update(
                sql,
                farmMember.getUserId(),
                farmMember.getFarmId()
        );
    }
}
