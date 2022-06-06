package com.aca.homework.week21.button.state;

public class ButtonOffState implements ButtonState{

    private Button button;

    public ButtonOffState(Button button) {
        this.button = button;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public ColorType color() {
        return ColorType.RED;
    }

    @Override
    public ButtonState nextState() {
        return new ButtonOnState(button);
    }
}
