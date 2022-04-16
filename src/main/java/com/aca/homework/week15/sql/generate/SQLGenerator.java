package com.aca.homework.week15.sql.generate;

public class SQLGenerator {

    public String generateInsert(User user){
       return "insert into users (full_name, age) values ('" + user.getName() + "', "  + user.getAge() + ");";
    }
}
