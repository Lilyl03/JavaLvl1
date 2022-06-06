package com.aca.homework.week19.job_platform.facade.request;

import java.util.Objects;

public final class JobHireRequestDto {
    private final Long userId;
    private final Long orgId;

    public JobHireRequestDto(Long userId, Long orgId) {
        this.userId = userId;
        this.orgId = orgId;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getOrgId() {
        return orgId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobHireRequestDto that = (JobHireRequestDto) o;
        return Objects.equals(userId, that.userId) && Objects.equals(orgId, that.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, orgId);
    }

    @Override
    public String toString() {
        return "JobHireRequestDto{" + "userId=" + userId + ", orgId=" + orgId + '}';
    }
}
