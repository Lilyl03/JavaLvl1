package com.aca.homework.week15.sql.generate;

import java.lang.reflect.Field;

public class SQLGenerator {

    public String generateInsert(User user) throws IllegalAccessException {
       return "insert into users (" + getColumnNames(user) + ") values (" + getColumnValues(user) + ");";
    }

    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(new SQLGenerator().generateInsert(new User("John", 16)));
    }
    public String getColumnNames(User user){
        StringBuilder columNames = new StringBuilder();
        for (Field declaredField : user.getClass().getDeclaredFields()) {
            Column column = declaredField.getAnnotation(Column.class);
            if (column != null) columNames.append(column.name() + ",");
        }
        return String.valueOf(columNames.substring(0,columNames.length()-1));
    }
    public String getTableName(User user){
        Table tableName = user.getClass().getAnnotation(Table.class);
        if(tableName != null){
            return String.valueOf(tableName);
        }
        return "";
    }
    public String getColumnValues(User user) throws IllegalAccessException {
        StringBuilder columValues = new StringBuilder();
        for (Field declaredField : user.getClass().getDeclaredFields()) {
            declaredField.setAccessible(true);
            if(declaredField.get(user) != null && declaredField.get(user) instanceof String) columValues.append(String.valueOf("'" + declaredField.get(user)) + "',");
            else if(declaredField.get(user) != null) columValues.append(String.valueOf(declaredField.get(user)) + ",");
        }
        return String.valueOf(columValues.substring(0, columValues.length()-1));
    }
}
