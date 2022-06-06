package com.aca.homework.week19.job_platform.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "ORGANIZATIONS")
public final class Organization {
    @Id
    @SequenceGenerator(name = "organization_sequence", sequenceName = "organization_sequence")
    @GeneratedValue(generator = "organization_sequence", strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "org_name", nullable = false, unique = true)
    private String name;

    @Column(name = "eid", nullable = false, unique = true)
    private String eid;

    @Column(name = "owner", nullable = false)
    private String owner;

    @Column(name = "registration_date", nullable = false)
    private LocalDate registrationDate;

    private List<User> employees;

    public Organization(String name, String eid, String owner, LocalDate registrationDate) {
        this.name = name;
        this.eid = eid;
        this.owner = owner;
        this.registrationDate = registrationDate;
    }

    public Organization() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public List<User> getEmployees() {
        return employees;
    }

    public void setEmployees(List<User> employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return id.equals(that.id) && name.equals(that.name) && eid.equals(that.eid) && owner.equals(that.owner) && registrationDate.equals(that.registrationDate) && employees.equals(that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, eid, owner, registrationDate, employees);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", eid='" + eid + '\'' +
                ", owner='" + owner + '\'' +
                ", registrationDate=" + registrationDate +
                ", employees=" + employees +
                '}';
    }
}
