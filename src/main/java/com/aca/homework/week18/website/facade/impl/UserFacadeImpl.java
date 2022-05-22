package com.aca.homework.week18.website.facade.impl;

import com.aca.homework.week18.website.entity.User;
import com.aca.homework.week18.website.facade.core.UserFacade;
import com.aca.homework.week18.website.facade.request.UserSignUpRequestDto;
import com.aca.homework.week18.website.facade.response.UserSignUpResponseDto;
import com.aca.homework.week18.website.repository.UserRepository;
import com.aca.homework.week18.website.service.core.UserService;
import com.aca.homework.week18.website.service.core.params.CreateUserParams;
import com.aca.homework.week18.website.service.impl.ImageServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFacadeImpl implements UserFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(ImageServiceImpl.class);

    private final UserService userService;
    private final UserRepository userRepository;

    public UserFacadeImpl(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @Override
    public UserSignUpResponseDto signUp(UserSignUpRequestDto dto) {
        LOGGER.info("Signing up the user for the provided request - {}", dto);
        if (userRepository.existsByUsername(dto.getUserName())) {
            return new UserSignUpResponseDto(List.of("This user already exists"));
        }
        User user = userService.create(new CreateUserParams(dto.getFirstName(), dto.getSecondName(), dto.getUserName(), dto.getPassword()));
        LOGGER.info("Successfully signed up the user for the provided request - {}", dto);
        return new UserSignUpResponseDto(dto.getFirstName(), dto.getSecondName(), dto.getUserName());
    }
}
