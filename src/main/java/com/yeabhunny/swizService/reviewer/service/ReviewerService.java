package com.yeabhunny.swizService.reviewer.service;

import com.yeabhunny.swizService.reviewer.dto.response.ReviewerListResponse;
import com.yeabhunny.swizService.reviewer.entity.Reviewer;
import com.yeabhunny.swizService.reviewer.repository.ReviewerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ReviewerService {

    @Autowired
    private ReviewerRepository reviewerRepository;

    public List<Reviewer> findAll() {

        return reviewerRepository.findAll();
    }
}
