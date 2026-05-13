package com.example.hellospring.dto.record;
import com.example.hellospring.entity.Category;

import java.time.LocalDateTime;

public record CategoriesResponse (int id, String name, String icon, String type){
    public CategoriesResponse(Category category) {
        this(
                category.getId(),
                category.getName(),
                category.getIcon(),
                category.getType()
        );
    }
}
