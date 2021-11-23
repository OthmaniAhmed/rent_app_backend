package com.example.project.rent_app_backend.security;

public class JwtResponse {
    private String token ;
    private String userName ;

    public JwtResponse(String token, String userName) {
        this.token = token;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
