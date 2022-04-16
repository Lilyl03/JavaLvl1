package com.aca.homework.week7.button.click;

public class Button {
    private final String text;
    private final Action action;

    public Button(String text, Action action) {
        this.text = text;
        this.action = action;
    }

    public void click(){
        action.doAction();
    }
}
