package com.yeabhunny.swizService.reviewer;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yeabhunny.swizService.reviewer.dto.response.ReviewerListResponse;

@Controller
@RequestMapping("/reviewer")
public class ReviewerController {

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public List<ReviewerListResponse> getAllReviewers(){
        ReviewerListResponse rec1 = new ReviewerListResponse(1L, "Adam", "Kowalski", 3);
        ReviewerListResponse rec2 = new ReviewerListResponse(2L, "Bartosz", "Kowalski", 6);
        ReviewerListResponse rec3 = new ReviewerListResponse(3L, "Cezary", "Kowalski", 5);
        ReviewerListResponse rec4 = new ReviewerListResponse(4L, "Damian", "Kowalski", 7);
        ReviewerListResponse rec5 = new ReviewerListResponse(5L, "Emil", "Kowalski", 2);
        ReviewerListResponse rec6 = new ReviewerListResponse(6L, "Franciszek", "Kowalski", 1);
        ReviewerListResponse rec7 = new ReviewerListResponse(7L, "Dominik", "Króliczek", 3);
        List<ReviewerListResponse> recs = Arrays.asList(rec1, rec2, rec3, rec4, rec5, rec6, rec7);
        return recs;
    }
}
