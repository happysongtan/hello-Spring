package com.example.hellospring.Repository;

import com.example.hellospring.dto.user.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final JdbcTemplate jdbcTemplate;
    //필요하다고 선언하면 스프링에서 넣어줌
    public List<UserResponse>findAll(){
        String sql= """
                SELECT id, user_id,name,age,current_pig_level,
                monthly_income,target_expense_ratio,created_at
                FROM users
                """;
        return jdbcTemplate.query(sql,(rs, rowNum) ->
                new UserResponse(
                        rs.getInt("id"),
                        rs.getString("user_id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getInt("current_pig_level"),
                        rs.getInt("monthly_income"),
                        rs.getInt("target_expense_ratio"),
                        rs.getTimestamp("created_at").toLocalDateTime()
                )
        );
    }
    public UserResponse findById(int id){
        String sql= """
                SELECT id, user_id,name,age,current_pig_level,
                monthly_income,target_expense_ratio,created_at
                FROM users
                WHERE id=?
                """;
        return jdbcTemplate.queryForObject(
                sql,(rs, rowNum) -> new UserResponse(
                        rs.getInt("id"),
                        rs.getString("user_id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getInt("current_pig_level"),
                        rs.getInt("monthly_income"),
                        rs.getInt("target_expense_ratio"),
                        rs.getTimestamp("created_at").toLocalDateTime()
                ),
                id
        );
    }
}
// String sql = "SELECT id, user_id, user_password, name, age, current_pig_level, monthly_income, target_expense_ratio, created_at FROM users";
//String sql =
//        "SELECT id, user_id, user_password, name, age, current_pig_level, " +
//        "monthly_income, target_expense_ratio, created_at " +
//        "FROM users";