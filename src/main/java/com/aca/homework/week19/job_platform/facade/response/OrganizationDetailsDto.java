package com.aca.homework.week19.job_platform.facade.response;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public final class OrganizationDetailsDto {
    private String name;
    private String owner;
    private LocalDate registrationDate;
    private List<UserDetailsDto> employees;
    private List<String> errors;

    public OrganizationDetailsDto(String name, String owner, LocalDate registrationDate) {
        this.name = name;
        this.owner = owner;
        this.registrationDate = registrationDate;
    }

    public OrganizationDetailsDto(List<String> errors) {
        this.errors = errors;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public List<UserDetailsDto> getEmployees() {
        return employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrganizationDetailsDto that = (OrganizationDetailsDto) o;
        return Objects.equals(name, that.name) && Objects.equals(owner, that.owner) && Objects.equals(registrationDate, that.registrationDate) && Objects.equals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, owner, registrationDate, employees);
    }

    @Override
    public String toString() {
        return "OrganizationDetailsDto{" + "name='" + name + '\'' + ", owner='" + owner + '\'' + ", registrationDate=" + registrationDate + ", employees=" + employees + '}';
    }
}
