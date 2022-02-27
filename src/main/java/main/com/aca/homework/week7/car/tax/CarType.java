package com.aca.homework.week7.car.tax;

public enum CarType {
    ELECTRIC {
        @Override
        public long annualTex(int carYear) {
            int tax = 0;
            for (int i = carYear; i < year; i++) {
                tax += 5;
            }
            return tax;
        }
    },
    HYBRID {
        @Override
        public long annualTex(int carYear) {
            int tax = 0;
            for (int i = carYear; i < year; i++) {
                tax += (year - carYear) * 5;
            }
            return tax;
        }
    };

    private static final int year = 2022;

    public abstract long annualTex(int carYear);
}
