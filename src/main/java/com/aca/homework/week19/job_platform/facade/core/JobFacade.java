package com.aca.homework.week19.job_platform.facade.core;

import com.aca.homework.week19.job_platform.facade.request.JobHireRequestDto;
import com.aca.homework.week19.job_platform.facade.response.JobHireResponseDto;

public interface JobFacade {
    JobHireResponseDto hire(JobHireRequestDto dto);
}
