package com.aca.homework.week19.job_platform.service.impl;

import com.aca.classroom.week15.user.service.version4.facade.impl.UniversityFacadeImpl;
import com.aca.homework.week19.job_platform.entity.Invitation;
import com.aca.homework.week19.job_platform.entity.InvitationStatus;
import com.aca.homework.week19.job_platform.repository.InvitationRepository;
import com.aca.homework.week19.job_platform.service.core.InvitationService;
import com.aca.homework.week19.job_platform.service.core.params.CreateInvitationParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class InvitationServiceImpl implements InvitationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UniversityFacadeImpl.class);

    private final InvitationRepository invitationRepository;

    public InvitationServiceImpl(InvitationRepository invitationRepository) {
        this.invitationRepository = invitationRepository;
    }

    @Override
    public Invitation create(CreateInvitationParams params) {
        LOGGER.info("Creating an invitation for the provided params - {}", params);
        Invitation invitation = new Invitation(params.getDecription(), params.getStatus(), params.getUserId(), params.getOrgId());
        Invitation save = invitationRepository.save(invitation);
        LOGGER.info("Successfully created an invitation for the provided params - {}", params);
        return save;
    }

    @Override
    public Invitation changeInvitationStatus(Long id, InvitationStatus status) {
        LOGGER.info("Retrieving an invitation for the provided id - {}", id);
        Invitation invitation = getById(id);
        LOGGER.info("Successfully retrieved an invitation for the provided id - {}", id);
        LOGGER.info("Changing status of the invitation for the provided id - {}", id);
        invitation.setInvitationStatus(status);
        Invitation save = invitationRepository.save(invitation);
        LOGGER.info("Successfully changed the status for the provided id - {}", id);
        return save;
    }

    @Override
    public Invitation getById(Long id) {
        LOGGER.info("Retrieving an invitation for the provided id - {}", id);
        Optional<Invitation> byId1 = invitationRepository.findById(id);
        if (byId1.isEmpty()) {
            throw new RuntimeException("There is not a such invitation");
        }
        LOGGER.info("Successfully retrieved an invitation for the provided id - {}", id);
        return byId1.get();
    }
}
