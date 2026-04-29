package com.example.hellospring.controller;

import com.example.hellospring.dto.farm.FarmsMemberResponse;
import com.example.hellospring.dto.farm.FarmsResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class FarmController {
    @GetMapping("farms")
    public List<FarmsResponse> farms(){
        return List.of(
                new FarmsResponse(2, "23", LocalDateTime.of(2026, 4, 29, 12, 30)),
                new FarmsResponse(3, "24", LocalDateTime.of(2026, 4, 29, 12, 30)),
                new FarmsResponse(4, "25", LocalDateTime.of(2026, 4, 29, 12, 30))
        );

    }
    @GetMapping("farmsmember")
    public List<FarmsMemberResponse> farmsMember(){
        return List.of(
                new FarmsMemberResponse(2, 2,2, LocalDateTime.of(2026, 4, 29, 12, 30)),
                new FarmsMemberResponse(3, 3,3, LocalDateTime.of(2026, 4, 29, 12, 30)),
                new FarmsMemberResponse(4, 4,4, LocalDateTime.of(2026, 4, 29, 12, 30))

        );
    }
}
