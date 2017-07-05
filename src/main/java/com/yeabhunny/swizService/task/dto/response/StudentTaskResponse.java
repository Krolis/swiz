package com.yeabhunny.swizService.task.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yeabhunny.swizService.task.TaskStatus;

public class StudentTaskResponse {
    @JsonProperty("idPracy")
    private long id;
    @JsonProperty("tytulPracy")
    private String title;
    @JsonProperty("status")
    private TaskStatus status;
    @JsonProperty("promotor")
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
