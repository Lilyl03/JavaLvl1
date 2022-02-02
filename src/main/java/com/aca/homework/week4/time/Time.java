package com.aca.homework.week4.time;

public class Time {
    private long seconds = 0;
    private int hours = 0;
    private int minutes = 0;
    public Time(long seconds){
        this.seconds = seconds;
    }
    public long getSeconds(){
        getMinutes();
        return this.seconds;
    }
    public int getMinutes(){
        getHours();
        while(this.seconds / 60 >= 1){
            this.minutes = (int) this.seconds / 60;
            this.seconds = this.seconds % 60;
        }
        return this.minutes;
    }
    public int getHours(){
        while(this.seconds / 3600 >=  1){
            this.hours = (int)this.seconds / 3600;
            this.seconds = this.seconds % 3600;
        }
        return this.hours;
    }

}
