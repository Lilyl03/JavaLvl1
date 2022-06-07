package com.aca.homework.week19.job_platform.facade.impl;

import com.aca.classroom.week15.user.service.version4.facade.impl.UniversityFacadeImpl;
import com.aca.homework.week19.job_platform.entity.Organization;
import com.aca.homework.week19.job_platform.facade.core.OrganizationFacade;
import com.aca.homework.week19.job_platform.facade.request.OrganizationRegistrationRequestDto;
import com.aca.homework.week19.job_platform.facade.response.OrganizationDetailsDto;
import com.aca.homework.week19.job_platform.service.core.OrganizationService;
import com.aca.homework.week19.job_platform.service.core.params.CreateOrganizationParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class OrganizationFacadeImpl implements OrganizationFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(UniversityFacadeImpl.class);

    private final OrganizationService organizationService;

    public OrganizationFacadeImpl(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @Override
    public OrganizationDetailsDto register(OrganizationRegistrationRequestDto dto) {
        LOGGER.info("Registering an organization for the provided request - {}", dto);
        Organization organization = organizationService.create(new CreateOrganizationParams(dto.getName(), dto.getEid(), dto.getOwner(), LocalDate.now()));
        LOGGER.info("Successfully registered an organization for the provided request - {}", dto);
        return new OrganizationDetailsDto(organization.getName(), organization.getOwner(), organization.getRegistrationDate());
    }

    @Override
    public OrganizationDetailsDto getOrganizationDetails(Long organizationId) {
        LOGGER.info("Retrieving the organization for the provided id - {}", organizationId);
        Organization byId = organizationService.getById(organizationId);
        LOGGER.info("Successfully retrieved the organization for the provided id - {}", organizationId);
        return new OrganizationDetailsDto(byId.getName(), byId.getOwner(), byId.getRegistrationDate());
    }
}
