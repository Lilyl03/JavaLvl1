package main.com.aca.homework.week9.reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class StringUtilsTest {

    @Test
    public void testReverseWhenArgumentIsNull(){
        Assertions.assertThrows(NullPointerException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                StringUtils.reverse(null);
            }
        });
    }

    @Test
    public void testReverseWhenLengthIs1(){
       Assertions.assertEquals("t",StringUtils.reverse("t"));
    }

    @Test
    public void testReverse(){
        Assertions.assertEquals("txet",StringUtils.reverse("text"));
    }

}