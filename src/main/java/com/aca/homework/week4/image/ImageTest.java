package com.aca.homework.week4.image;

public class ImageTest {
    public static void main(String[] args) {
        Image image = new Image(5,10);
        image.show();
        image.draw(1,2);
        image.draw(2,1);
        image.draw(2,2);
        image.draw(2,3);
        image.show();
    }
}
