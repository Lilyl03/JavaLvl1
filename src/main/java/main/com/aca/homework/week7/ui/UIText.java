package com.aca.homework.week7.ui;

public class UIText extends UIView {
    private String value;
    private String color;

    @Override
    public void click() {
        value = "Nice";
        color = "Green";
        height = 500;
        width = 500;
        System.out.println("clicked on a text \'" + value + "\' having a color " + color + ", width: " + width + ", height: " + height);
    }


}
