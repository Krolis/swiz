package com.yeabhunny.swizService.task.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yeabhunny.swizService.reviewer.dto.response.ReviewerListResponse;
import com.yeabhunny.swizService.task.TaskStatus;

import java.util.List;

public class TaskResponse {
    @JsonProperty("idPracy")
    private long id;
    @JsonProperty("tytulPracy")
    private String title;
    @JsonProperty("status")
    private TaskStatus status;
    @JsonProperty("promotor")
    private PrometerResponse prometer;
    @JsonProperty("student")
    private StudentResponse student;
    @JsonProperty("listaRecenzentow")
    private List<ReviewerListResponse> reviewerList;
    @JsonProperty("listaProponowanychRecenzentow")
    private List<ReviewerListResponse> proposedReviewerList;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setPrometer(PrometerResponse prometer) {
        this.prometer = prometer;
    }

    public PrometerResponse getPrometer() {
        return prometer;
    }

    public void setStudent(StudentResponse student) {
        this.student = student;
    }

    public StudentResponse getStudent() {
        return student;
    }

    public List<ReviewerListResponse> getReviewerList() {
        return reviewerList;
    }

    public void setReviewerList(List<ReviewerListResponse> reviewerList) {
        this.reviewerList = reviewerList;
    }

    public List<ReviewerListResponse> getProposedReviewerList() {
        return proposedReviewerList;
    }

    public void setProposedReviewerList(List<ReviewerListResponse> proposedReviewerList) {
        this.proposedReviewerList = proposedReviewerList;
    }
}
