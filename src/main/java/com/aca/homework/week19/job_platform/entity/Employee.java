package com.aca.homework.week19.job_platform.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "EMPLOYEES")
public final class Employee {
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "FK_EMPLOYEE_USER_ID_ID"))
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "org_id", nullable = false, foreignKey = @ForeignKey(name = "FK_EMPLOYEE_ORGANIZATION_ID_ID"))
    private Long orgId;

    @Column(name = "registration_date", nullable = false)
    private LocalDate registrationDate;

    public Employee(Long userId, Long orgId, LocalDate registrationDate) {
        this.userId = userId;
        this.orgId = orgId;
        this.registrationDate = registrationDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
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
        Employee employee = (Employee) o;
        return Objects.equals(userId, employee.userId) && Objects.equals(orgId, employee.orgId) && Objects.equals(registrationDate, employee.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, orgId, registrationDate);
    }


    @Override
    public String toString() {
        return "Employee{" + "userId=" + userId + ", orgId=" + orgId + ", registrationDate=" + registrationDate + '}';
    }
}
