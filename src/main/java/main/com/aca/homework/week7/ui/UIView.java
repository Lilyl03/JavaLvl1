package main.com.aca.homework.week7.ui;

public abstract class UIView {
    private long width;
    private long height;

    public UIView(long width, long height) {
        this.width = width;
        this.height = height;
    }

    public long getWidth() {
        return width;
    }

    public long getHeight() {
        return height;
    }

    public abstract void click();
}
