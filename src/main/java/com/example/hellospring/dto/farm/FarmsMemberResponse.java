package com.example.hellospring.dto.farm;

import java.time.LocalDateTime;

public record FarmsMemberResponse (int id, int user_id, int farm_id, LocalDateTime joined_at){
}
