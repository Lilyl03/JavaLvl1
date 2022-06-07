package com.aca.homework.week19.job_platform.service.core;

import com.aca.homework.week19.job_platform.entity.Invitation;
import com.aca.homework.week19.job_platform.entity.InvitationStatus;
import com.aca.homework.week19.job_platform.service.core.params.CreateInvitationParams;

public interface InvitationService {
    Invitation create(CreateInvitationParams params);

    Invitation changeInvitationStatus(Long id, InvitationStatus status);

    Invitation getById(Long id);
}
