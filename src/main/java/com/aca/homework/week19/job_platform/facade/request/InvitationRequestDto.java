package com.aca.homework.week19.job_platform.facade.request;

import com.aca.homework.week19.job_platform.entity.InvitationStatus;

import java.util.Objects;

public final class InvitationRequestDto {
    private final String description;
    private final InvitationStatus status;
    private final Long userId;
    private final Long orgId;

    public InvitationRequestDto(String description, InvitationStatus status, Long userId, Long orgId) {
        this.description = description;
        this.status = status;
        this.userId = userId;
        this.orgId = orgId;
    }

    public String getDescription() {
        return description;
    }

    public InvitationStatus getStatus() {
        return status;
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
        InvitationRequestDto that = (InvitationRequestDto) o;
        return Objects.equals(description, that.description) && status == that.status && Objects.equals(userId, that.userId) && Objects.equals(orgId, that.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, status, userId, orgId);
    }

    @Override
    public String toString() {
        return "InvitationRequestDto{" + "description='" + description + '\'' + ", status=" + status + ", userId=" + userId + ", orgId=" + orgId + '}';
    }
}
