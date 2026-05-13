package com.example.hellospring.dto.farm;

import com.example.hellospring.entity.FarmMember;

import java.time.LocalDateTime;

public record FarmMemberResponse(int id, int user_id, int farm_id, LocalDateTime joined_at){
    public FarmMemberResponse (FarmMember farmMember){
        this(
                farmMember.getId(),
                farmMember.getUserId(),
                farmMember.getFarmId(),
                farmMember.getJoinedAt()
        );
    }
}
