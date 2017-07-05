package com.yeabhunny.swizService.session.dto.response;

import com.yeabhunny.swizService.session.AppRole;

public class LoginResponse {

    private Long userId;
    private AppRole role;


    public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }
}
