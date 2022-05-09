package com.aca.homework.week18.website.facade.response;

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
}
