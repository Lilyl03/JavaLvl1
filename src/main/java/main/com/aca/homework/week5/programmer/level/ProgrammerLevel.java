package com.aca.homework.week5.programmer.level;

public enum ProgrammerLevel {
    JUNIOR,
    MID,
    SENIOR;

    @Override
    public String toString() {
        if(this == ProgrammerLevel.JUNIOR){
            return "Junior Programmer";
        }else if(this == ProgrammerLevel.MID){
            return "Mid programmer";
        }else{
            return "Senior programmer";
        }
    }
}
