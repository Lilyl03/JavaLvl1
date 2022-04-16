package com.aca.homework.week3.numbers.max.min;

public class Numbers {
    private final long number1;
    private final long number2;
    private final long number3;

    public Numbers(int num1, int num2, int num3) {
        this.number1 = num1;
        this.number2 = num2;
        this.number3 = num3;

    }

    public void getMaxAndMin() {
        System.out.println("The max is : " + max(number1, max(number2, number3)));
        System.out.println("The min is : " + min(number1, max(number2, number3)));
    }

    public long max(long num1, long num2) {
        return num1 > num2 ? num1 : num2;
    }

    public long min(long num1, long num2) {
        return num1 < num2 ? num1 : num2;
    }

}
