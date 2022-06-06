package com.aca.homework.week19.job_platform.service.core.params;

import java.time.LocalDate;
import java.util.Objects;

public final class CreateOrganizationParams {
    private final String name;
    private final String eid;
    private final String owner;
    private final LocalDate registrationDate;


    public CreateOrganizationParams(String name, String eid, String owner, LocalDate registrationDate) {
        this.name = name;
        this.eid = eid;
        this.owner = owner;
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public String getEid() {
        return eid;
    }

    public String getOwner() {
        return owner;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateOrganizationParams that = (CreateOrganizationParams) o;
        return Objects.equals(name, that.name) && Objects.equals(eid, that.eid) && Objects.equals(owner, that.owner) && Objects.equals(registrationDate, that.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, eid, owner, registrationDate);
    }

    @Override
    public String toString() {
        return "CreateOrganizationParams{" + "name='" + name + '\'' + ", eid='" + eid + '\'' + ", owner='" + owner + '\'' + ", registrationDate=" + registrationDate + '}';
    }
}
