package com.aca.homework.week19.job_platform.service.core;

import com.aca.homework.week19.job_platform.entity.User;
import com.aca.homework.week19.job_platform.service.core.params.CreateUserParams;


public interface UserService {
    User create(CreateUserParams params);

    User getById(Long id);

    User changeJobStatus(Long id);

    String checkJobStatus(Long id);
}
