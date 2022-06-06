package com.aca.homework.week19.job_platform.facade.impl;

import com.aca.classroom.week15.user.service.version4.facade.impl.UniversityFacadeImpl;
import com.aca.homework.week19.job_platform.entity.Invitation;
import com.aca.homework.week19.job_platform.entity.InvitationStatus;
import com.aca.homework.week19.job_platform.facade.core.InvitationFacade;
import com.aca.homework.week19.job_platform.facade.request.InvitationAcceptDto;
import com.aca.homework.week19.job_platform.facade.request.InvitationRejectDto;
import com.aca.homework.week19.job_platform.facade.request.InvitationRequestDto;
import com.aca.homework.week19.job_platform.facade.response.InvitationDetailsDto;
import com.aca.homework.week19.job_platform.service.core.InvitationService;
import com.aca.homework.week19.job_platform.service.core.UserService;
import com.aca.homework.week19.job_platform.service.core.params.CreateInvitationParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InvitationFacadeImpl implements InvitationFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(UniversityFacadeImpl.class);

    private final InvitationService invitationService;
    private final UserService userService;

    public InvitationFacadeImpl(InvitationService invitationService, UserService userService) {
        this.invitationService = invitationService;
        this.userService = userService;
    }

    @Override
    public InvitationDetailsDto sendInvitation(InvitationRequestDto dto) {
        LOGGER.info("Sending invitation for the provided request - {}", dto);
        String jobStatus = userService.checkJobStatus(dto.getUserId());
        if (jobStatus.equals("CLOSE")) {
            return new InvitationDetailsDto(List.of("Can't send invitation cause the job status is close"));
        }
        Invitation invitation = invitationService.create(new CreateInvitationParams(dto.getDescription(), InvitationStatus.PENDING, dto.getUserId(), dto.getOrgId()));
        LOGGER.info("Successfully sent an invitation for the provided request - {}", dto);
        return new InvitationDetailsDto(invitation.getInvitationStatus(), invitation.getUserId(), invitation.getOrgId());
    }

    @Override
    public InvitationDetailsDto acceptInvitation(InvitationAcceptDto dto) {
        LOGGER.info("Accepting invitation for the provided request - {}", dto);
        Invitation invitation = invitationService.changeInvitationStatus(dto.getUserId(), InvitationStatus.ACCEPTED);
        LOGGER.info("Successfully accepted the invitation for the provided request - {}", dto);
        return new InvitationDetailsDto(invitation.getInvitationStatus(), invitation.getUserId(), invitation.getOrgId());
    }

    @Override
    public InvitationDetailsDto rejectInvitation(InvitationRejectDto dto) {
        LOGGER.info("Rejecting invitation for the provided request - {}", dto);
        Invitation invitation = invitationService.changeInvitationStatus(dto.getUserId(), InvitationStatus.REJECTED);
        LOGGER.info("Successfully rejected the invitation for the provided request - {}", dto);
        return new InvitationDetailsDto(invitation.getInvitationStatus(), invitation.getUserId(), invitation.getOrgId());
    }
}
