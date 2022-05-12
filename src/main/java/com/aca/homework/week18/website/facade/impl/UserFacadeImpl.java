package com.aca.homework.week18.website.facade.impl;

import com.aca.homework.week18.website.entity.User;
import com.aca.homework.week18.website.facade.core.UserFacade;
import com.aca.homework.week18.website.facade.request.UserSignUpRequestDto;
import com.aca.homework.week18.website.facade.response.UserSignUpResponseDto;
import com.aca.homework.week18.website.repository.UserRepository;
import com.aca.homework.week18.website.service.core.UserService;
import com.aca.homework.week18.website.service.core.params.CreateUserParams;
import org.springframework.stereotype.Component;

@Component
public class UserFacadeImpl implements UserFacade {
    private UserService userService;
    private UserRepository userRepository;

    public UserFacadeImpl(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @Override
    public UserSignUpResponseDto signUp(UserSignUpRequestDto dto) {
        if(userRepository.existsByUsername(dto.getUserName())){
            throw new RuntimeException("The user already exists");
        }
        User user = userService.create(new CreateUserParams(dto.getFirstName(), dto.getSecondName(), dto.getUserName(), dto.getPassword()));

        return new UserSignUpResponseDto(dto.getFirstName(),dto.getSecondName(),dto.getUserName());
    }
}
