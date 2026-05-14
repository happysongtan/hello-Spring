package com.example.hellospring.controller;

import com.example.hellospring.dto.farm.FarmRequest;
import com.example.hellospring.dto.farm.FarmResponse;
import com.example.hellospring.entity.Farm;
import com.example.hellospring.repository.FarmMemberRepository;
import com.example.hellospring.repository.FarmRepository;
import com.example.hellospring.dto.farm.FarmMemberResponse;
import com.example.hellospring.service.FarmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FarmController {
    private final FarmService farmService;
    @GetMapping("/farms")
    public List<FarmResponse> getFarms()
    {
        return farmService.getFarms();

    }
    @GetMapping("farmmembers")
    public List<FarmMemberResponse> findAll(){

        return farmService.getFarmMembers();
    }
    @PostMapping("/farms")
    public void createFarm(@RequestBody FarmRequest request) {
        farmService.createFarm(request);
    }
}
