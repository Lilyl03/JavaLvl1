package com.aca.homework.week5.equals;

public class Motorcycle {
    private final Owner owner;
    private final MotorcycleType brand;

    public Motorcycle(Owner owner, MotorcycleType brand){
        this.owner = owner;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Motorcycle that = (Motorcycle) o;

        return that.brand.equals(brand) && that.owner.equals(owner);
    }

    @Override
    public String toString() {
        return "Owner: " + owner + "brand: " + brand;
    }
}
