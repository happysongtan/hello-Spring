package com.example.hellospring.service;

import com.example.hellospring.dto.farm.FarmMemberResponse;
import com.example.hellospring.dto.farm.FarmRequest;
import com.example.hellospring.dto.farm.FarmResponse;
import com.example.hellospring.entity.Farm;
import com.example.hellospring.repository.FarmMemberRepository;
import com.example.hellospring.repository.FarmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FarmService {
    private final FarmRepository farmRepository;
    private final FarmMemberRepository farmMemberRepository;
    public List<FarmResponse> getFarms() {
        return farmRepository.findAll()
                .stream()
                .map(FarmResponse::new)
                .toList();
    }
    public List<FarmMemberResponse> getFarmMembers() {
        return farmMemberRepository.findAll()
                .stream()
                .map(FarmMemberResponse::new)
                .toList();
    }

    public void createFarm(FarmRequest request) {
        Farm farm = new Farm(request.name());
        farmRepository.save(farm);
    }
}
