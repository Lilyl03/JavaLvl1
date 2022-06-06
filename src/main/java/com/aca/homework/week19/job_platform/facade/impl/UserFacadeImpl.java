package com.aca.homework.week19.job_platform.facade.impl;

import com.aca.classroom.week15.user.service.version4.facade.impl.UniversityFacadeImpl;
import com.aca.homework.week19.job_platform.entity.User;
import com.aca.homework.week19.job_platform.facade.core.UserFacade;
import com.aca.homework.week19.job_platform.facade.request.UserSignUpRequestDto;
import com.aca.homework.week19.job_platform.facade.response.UserDetailsDto;
import com.aca.homework.week19.job_platform.service.core.UserService;
import com.aca.homework.week19.job_platform.service.core.params.CreateUserParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserFacadeImpl implements UserFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(UniversityFacadeImpl.class);

    private final UserService userService;

    public UserFacadeImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetailsDto signUp(UserSignUpRequestDto dto) {
        LOGGER.info("Signing up a user for the provided request - {}", dto);
        User user = userService.create(new CreateUserParams(dto.getFirstName(), dto.getLastName(), dto.getUsername(), dto.getPassword(), dto.getJobState(), dto.getLocalDate()));
        LOGGER.info("Successfully signed up a user for the provided request - {}", dto);
        return new UserDetailsDto(user.getFirstName(), user.getLastName(), user.getUsername(), user.getJobState(), user.getRegistrationDate());
    }

    @Override
    public UserDetailsDto getUserDetails(Long userId) {
        LOGGER.info("Retrieving a user for the provided id - {}", userId);
        User byId = userService.getById(userId);
        LOGGER.info("Successfully retrieved the user for the provided id - {}", userId);
        return new UserDetailsDto(byId.getFirstName(), byId.getLastName(), byId.getUsername(), byId.getJobState(), byId.getRegistrationDate());
    }

    @Override
    public UserDetailsDto openToWork(Long userId) {
        LOGGER.info("Changing the job status to OPEN for the provided id - {}", userId);
        User user = userService.changeJobStatus(userId);
        LOGGER.info("Successfully changed the job status to OPEN for the provided id - {}", userId);
        return new UserDetailsDto(user.getFirstName(), user.getLastName(), user.getUsername(), user.getJobState(), user.getRegistrationDate());
    }
}
