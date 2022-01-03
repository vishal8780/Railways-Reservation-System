package com.cap.admin.model;

public class UserResponse {
	
private String token;

	public UserResponse(String token) {
		super();
		this.token = token;
	}

	public UserResponse() {
		// TODO Auto-generated constructor stub
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "UserResponse [token=" + token + "]";
	}
}
