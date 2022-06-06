package com.aca.homework.week21.button.state;


public class ButtonOnState implements ButtonState{
    private Button button;

    public ButtonOnState(Button button) {
        this.button = button;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public ColorType color() {
        return ColorType.GREEN;
    }

    @Override
    public ButtonState nextState() {
        return new ButtonOffState(button);
    }
}
