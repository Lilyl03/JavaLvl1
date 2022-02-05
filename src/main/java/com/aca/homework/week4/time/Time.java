package com.aca.homework.week4.time;

public class Time {
    private long seconds = 0;
    public Time(long seconds){
        this.seconds = seconds;
    }
    public long getSeconds(){
        return (this.seconds % 3600)%60;
    }
    public int getMinutes(){
        return (int) ((this.seconds % 3600)/60);
    }
    public int getHours(){
        return (int)this.seconds / 3600;
    }

}
