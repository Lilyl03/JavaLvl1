package com.aca.homework.week9.generic.queue;

public class Queue<T> {
    private static int cnt = -1;
    private Object[] array = new Object[10_000];

    public int getCnt() {
        return cnt;
    }

    public void produce(T object) {
        if (object != null) {
            array[++cnt] = object;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public T consume() {
        if (cnt == -1) {
            throw new QueueEmptyException();
        }
        T consumed = (T) array[cnt];
        array[cnt--] = null;
        return consumed;

    }

}
