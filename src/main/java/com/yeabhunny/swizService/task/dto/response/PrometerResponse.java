package com.yeabhunny.swizService.task.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrometerResponse {
    @JsonProperty("imie")
    private String name;
    @JsonProperty("nazwisko")
    private String surname;
    @JsonProperty("id")
    private long id;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
