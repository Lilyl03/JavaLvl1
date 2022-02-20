package com.aca.homework.week7.ui;

public class UIButton extends UIView {
    private String buttonColor;

    @Override
    public void click() {
        buttonColor = "Red";
        height = 300;
        width = 40;
        System.out.println("clicked on a button having a color " + buttonColor + ", width: " + width + ", height: " + height);
    }
}
