package com.aca.homework.week15.sql.generate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserCrudRepository {
    private Connection connection;

    public UserCrudRepository(Connection connection) {
        this.connection = connection;
    }

    public User save(User user) throws SQLException {
        connection.createStatement().execute("insert into users(full_name,age) values ('" + user.getName()+" ', "+ user.getAge()+")");
        return user;
    }


}
