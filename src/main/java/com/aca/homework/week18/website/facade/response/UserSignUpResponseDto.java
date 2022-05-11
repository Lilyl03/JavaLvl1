package com.aca.homework.week18.website.facade.response;

import java.util.Objects;

public class UserSignUpResponseDto {
    private String firstName;
    private String secondName;
    private String username;

    public UserSignUpResponseDto(String firstName, String secondName, String username) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSignUpResponseDto that = (UserSignUpResponseDto) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(secondName, that.secondName) && Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, username);
    }

    @Override
    public String toString() {
        return "UserSignUpResponseDto{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
