package main.com.aca.homework.week7.ui;

public class UIText extends UIView {
    private String value;
    private String color;

    public UIText(long width, long height, String value, String color) {
        super(width, height);
        this.value = value;
        this.color = color;
    }

    @Override
    public void click() {
        System.out.println("clicked on a text \'" + value + "\' having a color " + color + ", width: " + getWidth() + ", height: " + getHeight());
    }


}
