package com.yeabhunny.swizService.task.entity;

import com.yeabhunny.swizService.reviewer.entity.Reviewer;
import com.yeabhunny.swizService.task.TaskStatus;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private long id;
    private String title;
    private TaskStatus status;
    private Prometer prometer;
    private Student student;
    private List<Reviewer> reviewerList;
    private List<Reviewer> proposedReviewerList;

    public Task() {
        this.reviewerList = new ArrayList<>();
        this.proposedReviewerList = new ArrayList<>();
    }

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

    public Prometer getPrometer() {
        return prometer;
    }

    public void setPrometer(Prometer prometer) {
        this.prometer = prometer;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Reviewer> getReviewerList() {
        return reviewerList;
    }

    public void setReviewerList(List<Reviewer> reviewerList) {
        this.reviewerList = reviewerList;
    }

    public List<Reviewer> getProposedReviewerList() {
        return proposedReviewerList;
    }

    public void setProposedReviewerList(List<Reviewer> proposedReviewerList) {
        this.proposedReviewerList = proposedReviewerList;
    }
}
