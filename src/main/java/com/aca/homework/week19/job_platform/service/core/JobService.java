package com.aca.homework.week19.job_platform.service.core;

import com.aca.homework.week19.job_platform.entity.Employee;
import com.aca.homework.week19.job_platform.service.core.params.CreateEmployeeParams;

public interface JobService {
    Employee create(CreateEmployeeParams params);
}
