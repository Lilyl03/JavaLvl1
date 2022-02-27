package com.aca.homework.week4.pixel;

public class ColorPixelTest {
    public static void main(String[] args) {
        ColorPixel colorPixel1 = new ColorPixel(12, 12, "red");
        ColorPixel colorPixel2 = new ColorPixel(12, 2, "red");
        ColorPixel colorPixel3 = new ColorPixel(10, 12, "blue");
        ColorPixel[] colorPixels = {colorPixel1, colorPixel2, colorPixel3};
        for (int i = 0; i < colorPixels.length; i++) {
            System.out.println("x: " + colorPixels[i].getX() + " y: " + colorPixels[i].getY() + " color: " + colorPixels[i].getColor());
        }
    }

}
