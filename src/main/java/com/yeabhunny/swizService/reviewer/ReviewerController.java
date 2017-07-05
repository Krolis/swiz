package com.yeabhunny.swizService.reviewer;

import com.yeabhunny.swizService.reviewer.dto.response.ReviewerListResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/reviewer")
public class ReviewerController {

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public List<ReviewerListResponse> getAllReviewers(){
        ReviewerListResponse rec1 = new ReviewerListResponse(1L, "Adam", "Kowalski", 3, true);
        ReviewerListResponse rec2 = new ReviewerListResponse(2L, "Bartosz", "Kowalski", 6, true);
        ReviewerListResponse rec3 = new ReviewerListResponse(3L, "Cezary", "Kowalski", 5, true);
        ReviewerListResponse rec4 = new ReviewerListResponse(4L, "Damian", "Kowalski", 7, false);
        ReviewerListResponse rec5 = new ReviewerListResponse(5L, "Emil", "Kowalski", 2, false );
        ReviewerListResponse rec6 = new ReviewerListResponse(6L, "Franciszek", "Kowalski", 1, true);

        List<ReviewerListResponse> recs = Arrays.asList(rec1, rec2, rec3, rec4, rec5, rec6);
        return recs;
    }
}
