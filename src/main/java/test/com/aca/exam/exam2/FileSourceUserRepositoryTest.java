package com.aca.exam.exam2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class FileSourceUserRepositoryTest {
    FileSourceUserRepository testSubject = new FileSourceUserRepository();

    @Test
    void testFindByIdWhenIdIsFound() throws FileNotFoundException {
        Assertions.assertEquals(testSubject.findById("barracudaassign"), "{id='barracudaassign', firstName='Kaiya', lastName='Dunlap'}");
    }

    @Test
    void testFindAll() throws FileNotFoundException {
        Assertions.assertEquals(testSubject.findAll(), "{id='barracudaassign', firstName='Kaiya', lastName='Dunlap'}");
    }


}