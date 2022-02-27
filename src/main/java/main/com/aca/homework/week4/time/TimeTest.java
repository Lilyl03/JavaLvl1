package com.aca.homework.week4.time;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(3600+5*60+6);
        System.out.println(time.getSeconds() );
        System.out.println(time.getMinutes());
        System.out.println(time.getHours());
        Time time1 = new Time(0);
        System.out.println(time1.getSeconds() );
        System.out.println(time1.getMinutes());
        System.out.println(time1.getHours());
    }
}
