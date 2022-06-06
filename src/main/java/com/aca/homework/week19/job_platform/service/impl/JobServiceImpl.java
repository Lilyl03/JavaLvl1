package com.aca.homework.week19.job_platform.service.impl;

import com.aca.classroom.week15.user.service.version4.facade.impl.UniversityFacadeImpl;
import com.aca.homework.week19.job_platform.entity.Employee;
import com.aca.homework.week19.job_platform.repository.JobRepository;
import com.aca.homework.week19.job_platform.service.core.JobService;
import com.aca.homework.week19.job_platform.service.core.params.CreateEmployeeParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JobServiceImpl implements JobService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UniversityFacadeImpl.class);

    private final JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public Employee create(CreateEmployeeParams params) {
        LOGGER.info("Creating an employee for the provided params - {}", params);
        Employee employee = new Employee(params.getUserId(), params.getOrgId(), params.getRegistrationDate());
        Employee save = jobRepository.save(employee);
        LOGGER.info("Successfully created an employee for the provided params - {}", params);
        return save;
    }
}
