package com.aca.homework.week19.job_platform.service.impl;

import com.aca.classroom.week15.user.service.version4.facade.impl.UniversityFacadeImpl;
import com.aca.homework.week19.job_platform.entity.Organization;
import com.aca.homework.week19.job_platform.entity.User;
import com.aca.homework.week19.job_platform.repository.OrganizationRepository;
import com.aca.homework.week19.job_platform.service.core.OrganizationService;
import com.aca.homework.week19.job_platform.service.core.UserService;
import com.aca.homework.week19.job_platform.service.core.params.CreateOrganizationParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
public class OrganizationServiceImpl implements OrganizationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UniversityFacadeImpl.class);
    private final OrganizationRepository organizationRepository;
    private final UserService userService;

    public OrganizationServiceImpl(OrganizationRepository organizationRepository, UserService userService) {
        this.organizationRepository = organizationRepository;
        this.userService = userService;
    }

    @Override
    public Organization create(CreateOrganizationParams params) {
        LOGGER.info("Creating an organization for the provided params - {}", params);
        if (organizationRepository.existsByEid(params.getEid())) {
            throw new RuntimeException("The organization with such parameters already exists.");
        }
        Organization organization = new Organization(params.getName(), params.getEid(), params.getOwner(), LocalDate.now());
        Organization savedOrg = organizationRepository.save(organization);
        LOGGER.info("Successfully created an employee for the provided params - {}", params);
        return savedOrg;
    }

    @Override
    public Organization getById(Long id) {
        LOGGER.info("Retrieving the organization for the provided id - {}", id);
        Optional<Organization> byId = organizationRepository.findById(id);
        if (byId.isEmpty()) {
            throw new RuntimeException("Organization with this id does not exist");
        }
        LOGGER.info("Successfully retrieved the organization for the provided id - {}", id);
        return byId.get();
    }

    @Override
    public Organization addEmployee(Long userId, Long orgId) {
        LOGGER.info("Adding the user as the employee to the organization for the provided user_id - {} and org_id - {}", userId, orgId);
        User user = userService.getById(userId);
        Organization organization = getById(orgId);
        organization.setEmployees(List.of(user));
        Organization save = organizationRepository.save(organization);
        LOGGER.info("Successfully added the user as the employee to the organization for the provided user_id - {} and org_id - {}", userId, orgId);
        return save;
    }
}
