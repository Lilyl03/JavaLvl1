package com.aca.homework.week7.clone;

class LightTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Light lightsOn = Light.create(LightState.ON);
        Light lightsOff = Light.create(LightState.OFF);
        lightsOff.clone();
    }
}