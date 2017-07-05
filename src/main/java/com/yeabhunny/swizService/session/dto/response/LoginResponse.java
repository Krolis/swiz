package com.yeabhunny.swizService.session.dto.response;

import com.yeabhunny.swizService.session.AppRole;

public class LoginResponse {

    private String token;
    private AppRole role;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }
}
