package com.aca.homework.week18.website.facade.response;

public class UserSignUpResponseDto {
    private final String username;
    private final String firstName;
    private final String secondName;

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public UserSignUpResponseDto(String username, String firstName, String secondName) {
        this.username = username;
        this.firstName = firstName;
        this.secondName = secondName;
    }
}
