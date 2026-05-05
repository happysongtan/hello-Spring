package com.example.hellospring.controller;

import com.example.hellospring.Repository.FarmRepository;
import com.example.hellospring.dto.farm.FarmsMemberResponse;
import com.example.hellospring.dto.farm.FarmsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class FarmController {
    private final FarmRepository farmRepository;
    @GetMapping("/farms")
    public List<FarmsResponse> getFarms(){
        return farmRepository.findAllFarms();
    }
    @GetMapping("farmsmember")
    public List<FarmsMemberResponse> farmsMember(){
        return farmRepository.findAllFarmsMembers();
    }
}
