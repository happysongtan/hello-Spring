package com.example.hellospring.controller;

import com.example.hellospring.dto.farm.FarmRequest;
import com.example.hellospring.dto.farm.FarmResponse;
import com.example.hellospring.entity.Farm;
import com.example.hellospring.repository.FarmMemberRepository;
import com.example.hellospring.repository.FarmRepository;
import com.example.hellospring.dto.farm.FarmMemberResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FarmController {
    private final FarmRepository farmRepository;
    private final FarmMemberRepository farmMemberRepository;
    @GetMapping("/farms")
    public List<FarmResponse> getFarms()
    {
        return farmRepository.findAll()
                .stream()
                .map(FarmResponse::new)
                .toList();

    }
    @GetMapping("farmmembers")
    public List<FarmMemberResponse> findAll(){

        return farmMemberRepository.findAll()
                .stream()
                .map(FarmMemberResponse::new)
                .toList();
    }
    @PostMapping("/farms")
    public void createFarm(@RequestBody FarmRequest request) {
        Farm farm = new Farm(request.name());
        farmRepository.save(farm);
    }
}
