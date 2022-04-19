package com.aca.homework.week15.repository.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {


    public Connection getObject(){
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", null);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
