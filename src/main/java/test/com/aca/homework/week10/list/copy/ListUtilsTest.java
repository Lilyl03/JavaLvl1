package com.aca.homework.week10.list.copy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ListUtilsTest {
    @Test
    public void testCopy(){
        List<String> testList = List.of("a", "b", "c");
        List<String> testListCopy =  ListUtils.copy(testList);
        Assertions.assertEquals(testList,testListCopy);
        Assertions.assertEquals(testList.indexOf(0), testListCopy.indexOf(0));
        Assertions.assertEquals(testList.indexOf(1), testListCopy.indexOf(1));
        Assertions.assertEquals(testList.indexOf(2), testListCopy.indexOf(2));

    }

}