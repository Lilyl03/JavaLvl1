package com.aca.homework.week7.ui;

public class UIText implements UIView {
    private String value = "Nice";
    private String color = "Green";

    @Override
    public void click() {
        System.out.println("clicked on a text \'" + value + "\' having a color " + color + ", width: " + width + ", height: " + height);
    }


}
