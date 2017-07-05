package com.yeabhunny.swizService.session.entity;

import com.yeabhunny.swizService.session.AppRole;

public class Session {
    private String token;
    private AppRole role;

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }

    public AppRole getRole() {
        return role;
    }
}
