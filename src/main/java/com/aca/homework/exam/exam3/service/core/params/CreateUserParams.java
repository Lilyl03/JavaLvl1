package com.aca.homework.exam.exam3.service.core.params;

import com.aca.homework.exam.exam3.entity.NumberPlate;

import java.util.Objects;

public class CreateUserParams {
    private final String firstName;
    private final String secondName;
    private final String passportId;
    private final NumberPlate numberPlate;

    public CreateUserParams(String firstName, String secondName, String passportId, NumberPlate numberPlate) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.passportId = passportId;
        this.numberPlate = numberPlate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPassportId() {
        return passportId;
    }

    public NumberPlate getNumberPlate() {
        return numberPlate;
    }

    @Override
    public String toString() {
        return "CreateUserParams{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", passportId='" + passportId + '\'' +
                ", numberPlate=" + numberPlate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateUserParams that = (CreateUserParams) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(secondName, that.secondName) && Objects.equals(passportId, that.passportId) && Objects.equals(numberPlate, that.numberPlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, passportId, numberPlate);
    }
}
