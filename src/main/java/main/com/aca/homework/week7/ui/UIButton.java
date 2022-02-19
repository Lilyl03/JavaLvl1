package com.aca.homework.week7.ui;

public class UIButton implements UIView {
    private String buttonColor = "Red";

    @Override
    public void click() {
        System.out.println("clicked on a button having a color " + buttonColor + ", width: " + width + ", height: " + height);
    }
}
