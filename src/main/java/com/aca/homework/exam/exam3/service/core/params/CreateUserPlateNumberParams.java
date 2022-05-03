package com.aca.homework.exam.exam3.service.core.params;

import com.aca.homework.exam.exam3.entity.NumberPlate;
import com.aca.homework.exam.exam3.entity.User;

import java.util.Objects;

public class CreateUserPlateNumberParams {
    private final User user;
    private  final NumberPlate numberPlate;

    public CreateUserPlateNumberParams(User user, NumberPlate numberPlate) {
        this.user = user;
        this.numberPlate = numberPlate;
    }

    public User getUser() {
        return user;
    }

    public NumberPlate getNumberPlate() {
        return numberPlate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateUserPlateNumberParams that = (CreateUserPlateNumberParams) o;
        return Objects.equals(user, that.user) && Objects.equals(numberPlate, that.numberPlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, numberPlate);
    }

    @Override
    public String toString() {
        return "CreateUserPlateNumberParams{" +
                "user=" + user +
                ", numberPlate=" + numberPlate +
                '}';
    }
}
