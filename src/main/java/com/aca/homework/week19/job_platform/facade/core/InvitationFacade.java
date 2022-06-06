package com.aca.homework.week19.job_platform.facade.core;

import com.aca.homework.week19.job_platform.facade.request.InvitationAcceptDto;
import com.aca.homework.week19.job_platform.facade.request.InvitationRejectDto;
import com.aca.homework.week19.job_platform.facade.request.InvitationRequestDto;
import com.aca.homework.week19.job_platform.facade.response.InvitationDetailsDto;

public interface InvitationFacade {
    InvitationDetailsDto sendInvitation(InvitationRequestDto dto);

    InvitationDetailsDto acceptInvitation(InvitationAcceptDto dto);

    InvitationDetailsDto rejectInvitation(InvitationRejectDto dto);
}
