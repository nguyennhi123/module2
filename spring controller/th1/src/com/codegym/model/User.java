package com.codegym.model;

public class User {
    private String name;
    private String account;
    private String passworld;
    private String email;
    private int age;

    public User() {
    }

    public User(String name, String account, String passworld, String email, int age) {
        this.name = name;
        this.account = account;
        this.passworld = passworld;
        this.email = email;
        this.age = age;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }
}
