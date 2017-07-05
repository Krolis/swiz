package com.yeabhunny.swizService.task.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentResponse {
    @JsonProperty("id")
    private long id;
    @JsonProperty("imie")
    private String name;
    @JsonProperty("nazwisko")
    private String surname;

    public StudentResponse() {
    }

    public StudentResponse(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
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
}
