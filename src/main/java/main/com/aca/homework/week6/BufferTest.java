package main.com.aca.homework.week6;

public class BufferTest {

    public static void main(String[] args) {
        Buffer buffer = new BufferImpl();
        buffer.put("hello");
        buffer.put("hi");
        buffer.get();
        buffer.put("hi");

        Buffer buffer2 = new BufferImpl();
        buffer2.put("hi");
        System.out.println(buffer.equals(buffer2));
    }
}

