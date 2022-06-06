package com.aca.homework.week19.job_platform.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "USERS")
public final class User {
    @Id
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence")
    @GeneratedValue(generator = "user_sequence", strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "lastname", nullable = false)
    private String lastName;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "job_state", nullable = false)
    private String jobState;

    @Column(name = "registration_date", nullable = false)
    private LocalDate registrationDate;


    public User(String firstName, String lastName, String username, String password, String jobState, LocalDate registrationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.jobState = jobState;
        this.registrationDate = registrationDate;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJobState() {
        return jobState;
    }

    public void setJobState(JobState jobState) {
        this.jobState = jobState.name();
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) && firstName.equals(user.firstName) && lastName.equals(user.lastName) && username.equals(user.username) && password.equals(user.password) && jobState == user.jobState && registrationDate.equals(user.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, username, password, jobState, registrationDate);
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", username='" + username + '\'' + ", password='" + password + '\'' + ", jobState=" + jobState + ", registrationDate=" + registrationDate + '}';
    }
}
