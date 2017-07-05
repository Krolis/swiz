package com.yeabhunny.swizService.reviewer;

import com.yeabhunny.swizService.reviewer.dto.response.ReviewerListResponse;
import com.yeabhunny.swizService.reviewer.entity.Reviewer;
import com.yeabhunny.swizService.reviewer.service.ReviewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/reviewer")
public class ReviewerController {

    @Autowired
    private ReviewerService reviewerService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public List<ReviewerListResponse> getAllReviewers(){

        return reviewerService.findAll()
                .stream()
                .map(item->new ReviewerListResponse(item.getId(),item.getName(),item.getSurname(),item.getActualTaskCount()))
                .collect(Collectors.toList());
    }
}
