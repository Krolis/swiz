package com.yeabhunny.swizService.reviewer.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Reviewer {
    private long id;
    private String name;
    private String surname;
    private int actualTaskCount;

    public Reviewer() {
    }

    public Reviewer(long id, String name, String surname, int actualTaskCount) {
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
