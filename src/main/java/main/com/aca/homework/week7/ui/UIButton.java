package com.aca.homework.week7.ui;

public class UIButton extends UIView {
    private String buttonColor;
    public void ofText(String buttonColor, int height, int width){
        this.buttonColor = buttonColor;
        setHeight(height);
        setWidth(width);
    }
    @Override
    public void click() {
        System.out.println("clicked on a button having a color " + buttonColor + ", width: " + getWidth() + ", height: " + getHeight());
    }
}
