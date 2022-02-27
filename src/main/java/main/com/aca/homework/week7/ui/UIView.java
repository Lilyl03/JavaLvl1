package com.aca.homework.week7.ui;

public abstract class UIView {
    private long width;
    private long height;

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public abstract void click();
}
