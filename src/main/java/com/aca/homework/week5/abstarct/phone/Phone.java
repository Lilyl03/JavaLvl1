package com.aca.homework.week5.abstarct.phone;

public class Phone {
    private final String IMEI;
    private final Model model;

    public Phone(String IMEI, Model model){
        this.IMEI = IMEI;
        this.model = model;
    }

    public String getIMEI() {
        return IMEI;
    }

    public Model getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;
        return this.IMEI.equals(phone.IMEI);
    }

    @Override
    public String toString() {
        return model + ", IMEI: " + IMEI;
    }
}
