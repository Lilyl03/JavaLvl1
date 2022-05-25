package com.aca.homework.week18.website.service.impl;

import com.aca.homework.week18.website.entity.User;
import com.aca.homework.week18.website.repository.UserRepository;
import com.aca.homework.week18.website.service.core.UserService;
import com.aca.homework.week18.website.service.core.params.CreateUserParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostServiceImpl.class);

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(CreateUserParams params) {
        LOGGER.info("Creating a user for the provided params {}", params);
        User user = new User(params.getFirstName(), params.getSecondName(), params.getUsername(), params.getPassword());
        userRepository.save(user);
        LOGGER.info("Successfully created a user for the provided params {}", params);
        return user;
    }

    @Override
    public User getById(Long id) {
        LOGGER.info("Retrieving the post for the provided id {}", id);
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new RuntimeException("The user was not found");
        }
        LOGGER.info("Successfully retrieved the post for the provided params {}", id);
        return user.get();
    }
}
