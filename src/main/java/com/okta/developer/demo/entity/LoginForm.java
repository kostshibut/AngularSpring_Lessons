package com.okta.developer.demo.entity;

public class LoginForm {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String sout(){

        return password + "+" + username;
    }
}