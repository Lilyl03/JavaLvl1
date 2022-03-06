package main.com.aca.homework.week9.tuple2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Tuple2Test{
    private Tuple2 testSubject;

    @Test
    public void TestForStringAndInteger(){
        testSubject = new Tuple2<String, Integer>("text",45);
        Assertions.assertEquals("text", testSubject.getT1());
        Assertions.assertEquals(45, testSubject.getT2());
    }

    @Test
    public void TestForLongAndInteger(){
        testSubject = new Tuple2<Long,Integer>(102L,45);
        Assertions.assertEquals(102L, testSubject.getT1());
        Assertions.assertEquals(45, testSubject.getT2());
    }
}