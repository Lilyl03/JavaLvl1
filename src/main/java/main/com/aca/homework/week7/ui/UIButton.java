package main.com.aca.homework.week7.ui;

public class UIButton extends UIView {
    private String buttonColor;

    public UIButton(long width, long height, String buttonColor) {
        super(width, height);
        this.buttonColor = buttonColor;
    }

    public void ofText(String buttonColor, int height, int width){
        this.buttonColor = buttonColor;
    }
    @Override
    public void click() {
        System.out.println("clicked on a button having a color " + buttonColor + ", width: " + getWidth() + ", height: " + getHeight());
    }
}
