package com.aca.homework.week19.job_platform.facade.request;

import java.time.LocalDate;
import java.util.Objects;

public final class OrganizationRegistrationRequestDto {
    private final String name;
    private final String eid;
    private final String owner;
    private final LocalDate registrationDate;

    public OrganizationRegistrationRequestDto(String name, String eid, String owner) {
        this.name = name;
        this.eid = eid;
        this.owner = owner;
        this.registrationDate = LocalDate.now();
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
        OrganizationRegistrationRequestDto that = (OrganizationRegistrationRequestDto) o;
        return name.equals(that.name) && eid.equals(that.eid) && owner.equals(that.owner) && registrationDate.equals(that.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, eid, owner, registrationDate);
    }

    @Override
    public String toString() {
        return "OrganizationRegistrationRequestDto{" + "name='" + name + '\'' + ", eid='" + eid + '\'' + ", owner='" + owner + '\'' + ", registrationDate=" + registrationDate + '}';
    }
}
