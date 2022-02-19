package com.aca.homework.week4.image;

public class Image {
    private int vert;
    private int horiz;
    private char[][] pixels;

    public Image(int vert, int horiz) {
        this.horiz = horiz;
        this.vert = vert;
        this.pixels = fill();
    }

    private char[][] fill() {
        this.pixels = new char[this.horiz][this.vert];
        for (int i = 0; i < horiz; i++) {
            for (int t = 0; t < vert; t++) {
                this.pixels[i][t] = '-';
            }
        }
        return this.pixels;
    }

    public char[][] draw(int vert, int horiz) {
        this.pixels[vert][horiz] = '*';
        return this.pixels;
    }

    public void show() {
        for (int i = 0; i < horiz; i++) {
            for (int t = 0; t < vert; t++) {
                System.out.print(this.pixels[i][t] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
