package com.aca.homework.week6;

public class BufferImplement implements Buffer {
    private Object object;

    @Override
    public void put(Object object) {
        if (!isEmpty()) {
            System.out.println("The buffer is not empty");
            return;
        }
        this.object = object;
    }

    private boolean isEmpty() {
        return object == null;
    }

    @Override
    public Object get() {
        if (isEmpty()) {
            System.out.println("The buffer is empty");
            return null;
        }
        Object object = this.object;
        this.object = null;
        return object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof BufferImplement) {
            BufferImplement that = (BufferImplement) o;
            return object.equals(that.object);
        }
        return false;
    }

    @Override
    public String toString() {
        return "The buffer contains: " + object;
    }
}
