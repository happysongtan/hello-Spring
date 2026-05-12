package com.example.hellospring.controller;

import com.example.hellospring.repository.FarmMemberRepository;
import com.example.hellospring.repository.FarmRepository;
import com.example.hellospring.dto.farm.FarmsMemberResponse;
import com.example.hellospring.dto.farm.FarmsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FarmController {
    private final FarmRepository farmRepository;
    private final FarmMemberRepository farmMemberRepository;
    @GetMapping("/farms")
    public List<FarmsResponse> getFarms(){
        return farmRepository.findAll();
    }
    @GetMapping("farmsmember")
    public List<FarmsMemberResponse> findAll(){
        return farmMemberRepository.findAll();
    }
}
