package com.aca.homework.week19.job_platform.facade.request;

import com.aca.homework.week19.job_platform.entity.InvitationStatus;

import java.util.Objects;

public final class InvitationAcceptDto {
    private final Long userId;
    private final InvitationStatus status;

    public InvitationAcceptDto(Long userId) {
        this.userId = userId;
        this.status = InvitationStatus.ACCEPTED;
    }

    public Long getUserId() {
        return userId;
    }

    public InvitationStatus getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvitationAcceptDto that = (InvitationAcceptDto) o;
        return Objects.equals(userId, that.userId) && status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, status);
    }

    @Override
    public String toString() {
        return "InvitationAcceptDto{" + "userId=" + userId + ", status=" + status + '}';
    }
}
