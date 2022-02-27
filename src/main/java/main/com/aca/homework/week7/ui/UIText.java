package com.aca.homework.week7.ui;

public class UIText extends UIView {
    private String value;
    private String color;
    public void ofText(String value, String color, int height, int width){
        this.value = value;
        this.color = color;
        setHeight(height);
        setWidth(width);
    }
    @Override
    public void click() {
        System.out.println("clicked on a text \'" + value + "\' having a color " + color + ", width: " + getWidth() + ", height: " + getHeight());
    }


}
