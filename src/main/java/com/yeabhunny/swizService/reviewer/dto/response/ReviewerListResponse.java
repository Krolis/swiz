package com.yeabhunny.swizService.reviewer.dto.response;

public class ReviewerListResponse {

    private long id;
    private String name;
    private String surrname;
    private int actualTaskCount;
    private boolean isAvailable;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurrname() {
        return surrname;
    }

    public void setSurrname(String surrname) {
        this.surrname = surrname;
    }

    public int getActualTaskCount() {
        return actualTaskCount;
    }

    public void setActualTaskCount(int actualTaskCount) {
        this.actualTaskCount = actualTaskCount;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
