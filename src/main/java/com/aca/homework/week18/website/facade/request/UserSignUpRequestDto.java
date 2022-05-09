package com.aca.homework.week18.website.facade.request;

public class UserSignUpRequestDto {
    private String firstName;
    private String secondName;
    private String userName;
    private String password;

    public UserSignUpRequestDto(String firstName, String secondName, String userName, String password) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.userName = userName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
