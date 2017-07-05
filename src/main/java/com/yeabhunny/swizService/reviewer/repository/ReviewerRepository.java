package com.yeabhunny.swizService.reviewer.repository;

import com.yeabhunny.swizService.reviewer.dto.response.ReviewerListResponse;
import com.yeabhunny.swizService.reviewer.entity.Reviewer;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ReviewerRepository {

    private List<Reviewer> db;

    public ReviewerRepository() {
        Reviewer rec1 = new Reviewer(1L, "Adam", "Kowalski", 3);
        Reviewer rec2 = new Reviewer(2L, "Bartosz", "Kowalski", 6);
        Reviewer rec3 = new Reviewer(3L, "Cezary", "Kowalski", 5);
        Reviewer rec4 = new Reviewer(4L, "Damian", "Kowalski", 7);
        Reviewer rec5 = new Reviewer(5L, "Emil", "Kowalski", 2);
        Reviewer rec6 = new Reviewer(6L, "Franciszek", "Kowalski", 1);
        Reviewer rec7 = new Reviewer(7L, "Dominik", "Króliczek", 3);
        db = Arrays.asList(rec1, rec2, rec3, rec4, rec5, rec6, rec7);
    }

    public List<Reviewer> findAll() {
        return db;
    }
}
