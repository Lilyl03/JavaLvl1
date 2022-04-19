package com.aca.homework.week15.repository.employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRepositoryIntegrationTest {

    EmployeeRepository testSubject;

    @BeforeEach
    void init(){
        testSubject = new EmployeeRepository(new ConnectionFactory());
    }

    @Test
    void testSave(){
        testSubject.save(new Employee("1", "John", "J", 456000L));
        testSubject.save(new Employee("2", "John", "J", 456000L));
        testSubject.save(new Employee("3", "John", "J", 456000L));
        testSubject.save(new Employee("4", "John", "J", 456000L));
    }

    @Test
    void  testDeleteAll(){
        testSubject.deleteAll();
    }

    @Test
    void testFindAll(){
        testSubject.findAll();
    }

    @Test
    void testFindByIDPass(){
        testSubject.findById("1");
    }

    @Test
    void testFindByIDFail(){
        testSubject.findById("5");
    }
}