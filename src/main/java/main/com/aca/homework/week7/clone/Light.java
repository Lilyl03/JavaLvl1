package com.aca.homework.week7.clone;

public class Light implements Cloneable{
    private LightState state;

    private Light(LightState state) {
        this.state = state;
    }
    public static Light create(LightState state){
        return new Light(state);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
