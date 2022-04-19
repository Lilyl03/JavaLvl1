package com.aca.homework.week15.repository.employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class EmployeeRepository implements CrudRepository<Employee,String>{
    ConnectionFactory connectionFactory;

    public EmployeeRepository(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    @Override
    public void save(Employee employee) {
        try {
            connectionFactory.getObject().createStatement().execute("insert into employees(id,first_name,second_name,salary) values ("+ employee.getId() + ", '" + employee.getFirstName() + "' , '" + employee.getSecondName() + "' ," + employee.getSalary() + ")");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees= new LinkedList<>();
        String query = "select id, first_name, second_name, salary from employees";
        try {
            ResultSet rs = connectionFactory.getObject().createStatement().executeQuery(query);
            while (rs.next()) {
                String id = rs.getString("id");
                String first_name = rs.getString("first_name");
                String second_name = rs.getString("second_name");
                Long salary = rs.getLong("salary");
                employees.add(new Employee(id,first_name,second_name,salary));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }

    @Override
    public Employee findById(String s) {
        List<Employee> employees= findAll();
        for (Employee employee : employees) {
            if(employee.getId().equals(s)) {
                return employee;
            }
        }
        throw new RuntimeException("There is no employee with such an id");
    }

    @Override
    public void deleteAll() {
        try {
            connectionFactory.getObject().createStatement().execute("Delete from employees");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
