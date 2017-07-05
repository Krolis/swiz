package com.yeabhunny.swizService.session.model;

import com.yeabhunny.swizService.session.AppRole;

public class Credentials {

    private long userId;
    private String login;
    private String password;
    private AppRole role;

    public Credentials(long userId, String login, String password, AppRole role) {
        this.userId = userId;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }
}
