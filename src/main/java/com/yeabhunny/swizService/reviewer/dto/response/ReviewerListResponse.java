package com.yeabhunny.swizService.reviewer.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReviewerListResponse {

    @JsonProperty("id")
    private long id;
    @JsonProperty("imie")
    private String name;
    @JsonProperty("nazwisko")
    private String surname;
    @JsonProperty("ilPrac")
    private int actualTaskCount;

    public ReviewerListResponse(long id, String name, String surname, int actualTaskCount) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.actualTaskCount = actualTaskCount;
    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getActualTaskCount() {
        return actualTaskCount;
    }

    public void setActualTaskCount(int actualTaskCount) {
        this.actualTaskCount = actualTaskCount;
    }

}
