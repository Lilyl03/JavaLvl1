package com.aca.homework.week10.mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultUserMapperTest {
    @Test
    public void testMap(){
        User testSubject = new User(1L,"student", "Lord");
        UserModel testSub = new DefaultUserMapper().map(testSubject);
        Assertions.assertEquals(testSubject.getUsername(), testSub.getUsername());
        Assertions.assertEquals(testSubject.getFirstName(), testSub.getFirstName());
    }
}