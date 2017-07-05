package com.yeabhunny.swizService.task.repository;

import com.yeabhunny.swizService.task.dto.response.PrometerResponse;
import org.springframework.stereotype.Component;

@Component
public class PrometerRepository {
    public PrometerResponse getDefaultPrometer() {
        PrometerResponse promotor = new PrometerResponse(1L, "Jan", "Kowalski");
        return promotor;
    }
}
