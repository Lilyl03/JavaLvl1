package com.aca.homework.week19.job_platform.facade.response;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public final class JobHireResponseDto {
    private String username;
    private String orgName;
    private LocalDate registrationDate;
    private List<String> errors;

    public JobHireResponseDto(String username, String orgName, LocalDate registrationDate) {
        this.username = username;
        this.orgName = orgName;
        this.registrationDate = registrationDate;
    }

    public JobHireResponseDto(List<String> errors) {
        this.errors = errors;
    }


    public String getUsername() {
        return username;
    }

    public String getOrgName() {
        return orgName;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public List<String> getErrors() {
        return errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobHireResponseDto that = (JobHireResponseDto) o;
        return username.equals(that.username) && orgName.equals(that.orgName) && registrationDate.equals(that.registrationDate) && errors.equals(that.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, orgName, registrationDate, errors);
    }

    @Override
    public String toString() {
        return "JobHireResponseDto{" + "username='" + username + '\'' + ", orgName='" + orgName + '\'' + ", registrationDate=" + registrationDate + ", errors=" + errors + '}';
    }
}
