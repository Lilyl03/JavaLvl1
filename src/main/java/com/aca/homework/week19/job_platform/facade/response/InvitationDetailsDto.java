package com.aca.homework.week19.job_platform.facade.response;

import com.aca.homework.week19.job_platform.entity.InvitationStatus;

import java.util.List;
import java.util.Objects;

public final class InvitationDetailsDto {
    private InvitationStatus invitationStatus;
    private Long userId;
    private Long orgId;
    private List<String> errors;

    public InvitationDetailsDto(InvitationStatus invitationStatus, Long userId, Long orgId) {
        this.invitationStatus = invitationStatus;
        this.userId = userId;
        this.orgId = orgId;
    }

    public InvitationDetailsDto(List<String> errors) {
        this.errors = errors;
    }

    public InvitationStatus getInvitationStatus() {
        return invitationStatus;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public List<String> getErrors() {
        return errors;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvitationDetailsDto that = (InvitationDetailsDto) o;
        return invitationStatus == that.invitationStatus && userId.equals(that.userId) && orgId.equals(that.orgId) && errors.equals(that.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invitationStatus, userId, orgId, errors);
    }

    @Override
    public String toString() {
        return "InvitationDetailsDto{" + "invitationStatus=" + invitationStatus + ", userId=" + userId + ", orgId=" + orgId + ", errors=" + errors + '}';
    }
}
