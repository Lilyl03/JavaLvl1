package com.aca.homework.week15.sql.generate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class SQLGeneratorTest {
    public SQLGenerator testSubject;

    @BeforeEach
    void init(){
        testSubject = new SQLGenerator();
    }

    @Test
    void testGenerateInset(){

        try {
            Assertions.assertEquals("insert into users (full_name,age) values ('john kehoe',45);",
                                            testSubject.generateInsert(new User("john kehoe", 45)));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}