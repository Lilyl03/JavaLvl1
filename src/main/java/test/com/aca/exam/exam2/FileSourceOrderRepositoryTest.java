package com.aca.exam.exam2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class FileSourceOrderRepositoryTest {
        FileSourceOrderRepository testSubject;
        @BeforeEach
        void init(){
                testSubject = new FileSourceOrderRepository();
        }
        @Test
        void testFindByIdWhenIdIsFound() throws FileNotFoundException {
                Assertions.assertEquals(testSubject.findById(9), "Order{id=9, name='picnic mat', price=3000, purchasedUser=shawlinspire}");
        }

        @Test
        void testFindAllSize() throws FileNotFoundException {
                Assertions.assertEquals(testSubject.findAll().size(), 9);
        }
        @Test
        void testFindByIdWhenIdIsNotFound() throws FileNotFoundException {
                Assertions.assertEquals(testSubject.findById(45), "The Id is not found");
        }
}