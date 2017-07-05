package com.yeabhunny.swizService.task.dto.transform;

import com.yeabhunny.swizService.task.dto.response.PrometerResponse;
import com.yeabhunny.swizService.task.entity.Prometer;

public class PrometerTransform {
    public static PrometerResponse toResponse(Prometer prometer) {
        if (prometer==null) return null;
        return new PrometerResponse(prometer.getId(),prometer.getName(),prometer.getSurname());
    }
}
