package com.aca.homework.week19.job_platform.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "INVITATIONS")
public final class Invitation {
    @Id
    @SequenceGenerator(name = "invitation_sequence", sequenceName = "invitation_sequence")
    @GeneratedValue(generator = "invitation_sequence", strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "invitation_status")
    private InvitationStatus invitationStatus;

    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "FK_INVITATION_USER_ID_ID"))
    private Long userId;

    @JoinColumn(name = "org_id", nullable = false, foreignKey = @ForeignKey(name = "FK_INVITATION_ORGANIZATION_ID_ID"))
    private Long orgId;

    public Invitation(String description, InvitationStatus invitationStatus, Long userId, Long orgId) {
        this.description = description;
        this.invitationStatus = invitationStatus;
        this.userId = userId;
        this.orgId = orgId;
    }

    public Invitation() {
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InvitationStatus getInvitationStatus() {
        return invitationStatus;
    }

    public void setInvitationStatus(InvitationStatus invitationStatus) {
        this.invitationStatus = invitationStatus;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invitation that = (Invitation) o;
        return id.equals(that.id) && description.equals(that.description) && invitationStatus == that.invitationStatus && userId.equals(that.userId) && orgId.equals(that.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, invitationStatus, userId, orgId);
    }

    @Override
    public String toString() {
        return "Invitation{" + "id=" + id + ", description='" + description + '\'' + ", invitationStatus=" + invitationStatus + ", userId=" + userId + ", orgId=" + orgId + '}';
    }
}
