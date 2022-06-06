package com.aca.homework.week19.job_platform.facade.impl;

import com.aca.classroom.week15.user.service.version4.facade.impl.UniversityFacadeImpl;
import com.aca.homework.week19.job_platform.entity.Employee;
import com.aca.homework.week19.job_platform.entity.Organization;
import com.aca.homework.week19.job_platform.entity.User;
import com.aca.homework.week19.job_platform.facade.core.JobFacade;
import com.aca.homework.week19.job_platform.facade.request.JobHireRequestDto;
import com.aca.homework.week19.job_platform.facade.response.JobHireResponseDto;
import com.aca.homework.week19.job_platform.service.core.JobService;
import com.aca.homework.week19.job_platform.service.core.OrganizationService;
import com.aca.homework.week19.job_platform.service.core.UserService;
import com.aca.homework.week19.job_platform.service.core.params.CreateEmployeeParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class JobFacadeImpl implements JobFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(UniversityFacadeImpl.class);

    private final JobService jobService;
    private final UserService userService;
    private final OrganizationService organizationService;

    public JobFacadeImpl(JobService jobService, UserService userService, OrganizationService organizationService) {
        this.jobService = jobService;
        this.userService = userService;
        this.organizationService = organizationService;
    }

    @Override
    public JobHireResponseDto hire(JobHireRequestDto dto) {
        LOGGER.info("Hiring the user for the provided request - {}", dto);
        Employee employee = jobService.create(new CreateEmployeeParams(dto.getUserId(), dto.getOrgId(), LocalDate.now()));
        User user = userService.changeJobStatus(dto.getUserId());
        Organization organization = organizationService.addEmployee(dto.getUserId(), dto.getOrgId());
        LOGGER.info("Successfully hired the user for the provided request - {}", dto);
        return new JobHireResponseDto(user.getUsername(), organization.getName(), employee.getRegistrationDate());
    }
}
