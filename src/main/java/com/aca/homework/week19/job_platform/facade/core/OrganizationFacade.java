package com.aca.homework.week19.job_platform.facade.core;

import com.aca.homework.week19.job_platform.facade.request.OrganizationRegistrationRequestDto;
import com.aca.homework.week19.job_platform.facade.response.OrganizationDetailsDto;

public interface OrganizationFacade {
    OrganizationDetailsDto register(OrganizationRegistrationRequestDto dto);

    OrganizationDetailsDto getOrganizationDetails(Long organizationId);


}
