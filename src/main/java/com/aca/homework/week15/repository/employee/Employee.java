package com.aca.homework.week15.repository.employee;

@Table(name = "employees")
public class Employee {
    public Employee(String id, String firstName, String secondName, Long salary) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
    }

    @Column(name = "id")
    private final String id;

    @Column(name = "first_name")
    private final String firstName;

    @Column(name = "second_name")
    private final String secondName;

    @Column(name = "salary")
    private final Long salary;

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Long getSalary() {
        return salary;
    }
}
