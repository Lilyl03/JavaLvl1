package com.aca.homework.week19.job_platform.service.core;

import com.aca.homework.week19.job_platform.entity.Organization;
import com.aca.homework.week19.job_platform.service.core.params.CreateOrganizationParams;

public interface OrganizationService {
    Organization create(CreateOrganizationParams params);

    Organization getById(Long id);

    Organization addEmployee(Long userId, Long orgId);
}
