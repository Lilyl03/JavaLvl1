package com.aca.homework.week3.numbers.max.min;

public class Numbers {
    private long number1;
    private long number2;
    private long number3;

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
