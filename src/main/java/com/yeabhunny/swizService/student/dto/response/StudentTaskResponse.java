package com.yeabhunny.swizService.student.dto.response;

import com.yeabhunny.swizService.student.TaskStatus;

public class StudentTaskResponse {
    private long id;
    private String title;
    private TaskStatus status;
    private PrometerResponse prometer;

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
}
