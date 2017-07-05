package com.yeabhunny.swizService.reviewer;

import com.yeabhunny.swizService.reviewer.dto.response.ReviewerListResponse;
import com.yeabhunny.swizService.reviewer.entity.Reviewer;
import com.yeabhunny.swizService.reviewer.service.ReviewerService;
import com.yeabhunny.swizService.session.SessionController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger LOG = LoggerFactory.getLogger(ReviewerController.class);

    @Autowired
    private ReviewerService reviewerService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public List<ReviewerListResponse> getAllReviewers(){

        LOG.info("getAllReviewers");

        return reviewerService.findAll()
                .stream()
                .map(item->new ReviewerListResponse(item.getId(),item.getName(),item.getSurname(),item.getActualTaskCount()))
                .collect(Collectors.toList());
    }
}
