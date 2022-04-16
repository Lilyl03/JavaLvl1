package com.aca.homework.week5.equals;

public class Owner {
    private final String firstName;
    private final String lastName;

    public Owner(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName  = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Owner owner = (Owner) o;

       return this.firstName.equals(owner.firstName) && this.lastName.equals(owner.lastName);
    }

    @Override
    public String toString() {
        return "firstname: " + firstName + " lastname: " + lastName;
    }
}
