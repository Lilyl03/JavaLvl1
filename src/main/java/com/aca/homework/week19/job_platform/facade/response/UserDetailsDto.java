package com.aca.homework.week19.job_platform.facade.response;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public final class UserDetailsDto {
    private String firstName;
    private String lastName;
    private String userName;
    private String jobState;
    private LocalDate registrationDate;
    private List<String> errors;

    public UserDetailsDto(String firstName, String lastName, String userName, String jobState, LocalDate registrationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.jobState = jobState;
        this.registrationDate = registrationDate;
    }

    public UserDetailsDto(List<String> errors) {
        this.errors = errors;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getJobState() {
        return jobState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDetailsDto that = (UserDetailsDto) o;
        return firstName.equals(that.firstName) && lastName.equals(that.lastName) && userName.equals(that.userName) && jobState.equals(that.jobState) && registrationDate.equals(that.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, userName, jobState, registrationDate);
    }

    @Override
    public String toString() {
        return "UserDetailsDto{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", userName='" + userName + '\'' + ", jobState='" + jobState + '\'' + ", registrationDate=" + registrationDate + '}';
    }
}
