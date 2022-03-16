package com.aca.homework.week7.clone;

public class Light implements Cloneable {
    private final LightState state;

    private Light(boolean state) {
        this.state = state ? LightState.ON : LightState.OFF;
    }

    public static Light on() {
        return new Light(true);
    }

    public static Light off() {
        return new Light(false);
    }

    @Override
    protected Light clone() throws CloneNotSupportedException {
        return (Light) super.clone();
    }
}
