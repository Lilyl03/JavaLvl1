package com.aca.homework.week15.sql.generate;

import org.junit.jupiter.api.Test;

import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserCrudRepositoryIntegrationTest {
    private UserCrudRepository testSubject;

    @Test
    void testSave(){
        try {
            UserCrudRepository postgres = new UserCrudRepository(DriverManager.getConnection("jdbc:postgresql://127.0.0.1:7432/aca", "postgres", null));
            postgres.save(new User("John",21));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}