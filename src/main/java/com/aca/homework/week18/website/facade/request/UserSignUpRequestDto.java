package com.aca.homework.week18.website.facade.request;

import java.util.Objects;

public class UserSignUpRequestDto {
    private final String firstName;
    private final String secondName;
    private final String userName;
    private final String password;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSignUpRequestDto that = (UserSignUpRequestDto) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(secondName, that.secondName) && Objects.equals(userName, that.userName) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, userName, password);
    }

    @Override
    public String toString() {
        return "UserSignUpRequestDto{" + "firstName='" + firstName + '\'' + ", secondName='" + secondName + '\'' + ", userName='" + userName + '\'' + ", password='" + password + '\'' + '}';
    }
}
