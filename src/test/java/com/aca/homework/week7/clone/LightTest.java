package com.aca.homework.week7.clone;

class LightTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Light lightsOn = Light.on();
        Light lightsOff = Light.off();
        lightsOff.clone();
    }
}