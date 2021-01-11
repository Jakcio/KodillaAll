package com.kodilla.good.patterns.challenges.service;

import java.util.Objects;

public class User {

    private final String nickName;
    private final String fistName;
    private final String lastName;


    public User(String nickName, String fistName, String lastName) {
        this.nickName = nickName;
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return nickName.equals(user.nickName) && fistName.equals(user.fistName) && lastName.equals(user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName, fistName, lastName);
    }
}
