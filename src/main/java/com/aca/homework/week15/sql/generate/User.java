package com.aca.homework.week15.sql.generate;


import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="users")
public class User {
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Column(name = "full_name")
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Column(name = "age")
    private int age;


}
