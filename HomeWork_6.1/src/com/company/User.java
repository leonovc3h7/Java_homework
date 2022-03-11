package com.company;

abstract public class User {
    private String password;
    public String login;

    public User(String password, String login) {
        this.password = password;
        this.login = login;
    }
}
