package com.aca.homework.week19.job_platform.service.core.params;

import com.aca.homework.week19.job_platform.entity.InvitationStatus;

import java.util.Objects;

public final class CreateInvitationParams {
    private final String decription;
    private final InvitationStatus status;
    private final Long userId;
    private final Long orgId;

    public CreateInvitationParams(String decription, InvitationStatus status, Long userId, Long orgId) {
        this.decription = decription;
        this.status = status;
        this.userId = userId;
        this.orgId = orgId;
    }

    public String getDecription() {
        return decription;
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
        CreateInvitationParams that = (CreateInvitationParams) o;
        return decription.equals(that.decription) && status == that.status && userId.equals(that.userId) && orgId.equals(that.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(decription, status, userId, orgId);
    }


    @Override
    public String toString() {
        return "CreateInvitationParams{" + "decription='" + decription + '\'' + ", status=" + status + ", userId=" + userId + ", orgId=" + orgId + '}';
    }
}
