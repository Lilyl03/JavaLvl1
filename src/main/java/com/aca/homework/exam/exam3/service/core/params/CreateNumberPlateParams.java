package com.aca.homework.exam.exam3.service.core.params;

import java.util.Objects;

public class CreateNumberPlateParams {
    private final String numberPlate;


    public CreateNumberPlateParams(String numberPlate) {
        this.numberPlate = numberPlate;

    }

    public String getNumberPlate() {
        return numberPlate;
    }


    @Override
    public String toString() {
        return "CreateNumberPlateParams{" +
                "numberPlate='" + numberPlate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateNumberPlateParams that = (CreateNumberPlateParams) o;
        return Objects.equals(numberPlate, that.numberPlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPlate);
    }
}
