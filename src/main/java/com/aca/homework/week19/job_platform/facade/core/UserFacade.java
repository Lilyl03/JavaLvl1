package com.aca.homework.week19.job_platform.facade.core;

import com.aca.homework.week19.job_platform.facade.request.UserSignUpRequestDto;
import com.aca.homework.week19.job_platform.facade.response.UserDetailsDto;

public interface UserFacade {
    UserDetailsDto signUp(UserSignUpRequestDto dto);

    UserDetailsDto getUserDetails(Long userId);

    UserDetailsDto openToWork(Long userId);
}
