package com.aca.homework.week19.job_platform.service.core.params;

import java.time.LocalDate;
import java.util.Objects;

public final class CreateEmployeeParams {
    private final Long userId;
    private final Long orgId;
    private final LocalDate registrationDate;

    public CreateEmployeeParams(Long userId, Long orgId, LocalDate registrationDate) {
        this.userId = userId;
        this.orgId = orgId;
        this.registrationDate = registrationDate;
    }

    public Long getOrgId() {
        return orgId;
    }

    public Long getUserId() {
        return userId;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateEmployeeParams that = (CreateEmployeeParams) o;
        return Objects.equals(userId, that.userId) && Objects.equals(orgId, that.orgId) && Objects.equals(registrationDate, that.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, orgId, registrationDate);
    }

    @Override
    public String toString() {
        return "CreateEmployeeParams{" + "userId=" + userId + ", orgId=" + orgId + ", registrationDate=" + registrationDate + '}';
    }
}

