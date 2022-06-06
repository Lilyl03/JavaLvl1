package com.aca.homework.week19.job_platform.facade.request;

import com.aca.homework.week19.job_platform.entity.JobState;

import java.time.LocalDate;
import java.util.Objects;

public final class UserSignUpRequestDto {

    private final String firstName;
    private final String lastName;
    private final String username;
    private final String password;
    private final JobState jobState;
    private final LocalDate localDate;

    public UserSignUpRequestDto(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.jobState = JobState.CLOSE;
        this.localDate = LocalDate.now();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public JobState getJobState() {
        return jobState;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return "UserSignUpRequestDto{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", username='" + username + '\'' + ", password='" + password + '\'' + ", jobState=" + jobState + ", localDate=" + localDate + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSignUpRequestDto that = (UserSignUpRequestDto) o;
        return firstName.equals(that.firstName) && lastName.equals(that.lastName) && username.equals(that.username) && password.equals(that.password) && jobState == that.jobState && localDate.equals(that.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, username, password, jobState, localDate);
    }
}
