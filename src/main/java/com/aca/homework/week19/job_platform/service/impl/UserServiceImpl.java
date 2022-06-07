package com.aca.homework.week19.job_platform.service.impl;

import com.aca.classroom.week15.user.service.version4.facade.impl.UniversityFacadeImpl;
import com.aca.homework.week19.job_platform.entity.JobState;
import com.aca.homework.week19.job_platform.entity.User;
import com.aca.homework.week19.job_platform.repository.UserRepository;
import com.aca.homework.week19.job_platform.service.core.UserService;
import com.aca.homework.week19.job_platform.service.core.params.CreateUserParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UniversityFacadeImpl.class);

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(CreateUserParams params) {
        LOGGER.info("Creating a user for the provided params - {}", params);
        if (userRepository.existsByFirstNameAndLastNameAndUsername(params.getFirstName(), params.getLastName(), params.getUsername())) {
            throw new RuntimeException("The user already exists with this parameters");
        }
        User savedUser = userRepository.save(new User(params.getFirstName(), params.getLastName(), params.getUsername(), params.getPassword(), params.getJobState(), params.getLocalDate()));
        LOGGER.info("Successfully created a user for the provided params - {}", params);
        return savedUser;
    }

    @Override
    public User getById(Long id) {
        LOGGER.info("Retrieving the user for the provided id - {}", id);
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isEmpty()) {
            throw new RuntimeException("This user does not exist");
        }
        LOGGER.info("Successfully retrieved the user for the provided id - {}", id);
        return optionalUser.get();
    }

    @Override
    public User changeJobStatus(Long id) {
        LOGGER.info("Changing the user status for the provided id - {}", id);
        User user = getById(id);
        if (user.getJobState().equals("OPEN")) {
            user.setJobState(JobState.CLOSE);
        } else {
            user.setJobState(JobState.OPEN);
        }
        User savedUser = userRepository.save(user);
        LOGGER.info("Successfully changed the user status for the provided id - {}", id);
        return savedUser;
    }

    @Override
    public String checkJobStatus(Long id) {
        LOGGER.info("Checking the user status for the provided id - {}", id);
        User user = getById(id);
        String status = user.getJobState();
        LOGGER.info("Successfully changed the user status for the provided id - {}", id);
        return status;
    }
}
