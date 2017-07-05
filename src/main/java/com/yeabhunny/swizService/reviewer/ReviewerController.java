package com.yeabhunny.swizService.reviewer;

import com.yeabhunny.swizService.reviewer.dto.response.ReviewerListResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/reviewer")
public class ReviewerController {

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<ReviewerListResponse> getAllReviewers(){
        List<ReviewerListResponse> response = new LinkedList<>();
        for (int i =0; i<10; i++){
            ReviewerListResponse item = new ReviewerListResponse();
            item.setId(i);
            item.setName("name " + i);
            item.setSurrname("surrname " + i);
            item.setActualTaskCount(i);
            item.setAvailable(i%2==0);
        }

        return response;
    }
}
