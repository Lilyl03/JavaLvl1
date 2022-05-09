package com.aca.homework.week18.website.facade.impl;

import com.aca.homework.week18.website.entity.User;
import com.aca.homework.week18.website.facade.core.UserFacade;
import com.aca.homework.week18.website.facade.request.UserSignUpRequestDto;
import com.aca.homework.week18.website.facade.response.UserSignUpResponseDto;
import com.aca.homework.week18.website.repository.UserRepository;
import com.aca.homework.week18.website.service.core.params.CreateUserParams;
import com.aca.homework.week18.website.service.impl.UserServiceImpl;

public class UserFacadeImpl implements UserFacade {
    private UserRepository userRepository;

    @Override
    public UserSignUpResponseDto signUp(UserSignUpRequestDto dto) {
        if(userRepository.findByFirstNameAndSecondNameAndUsername().isPresent()){
            throw new RuntimeException("The user already exists");
        }
        User user = new UserServiceImpl().create(
                new CreateUserParams(
                        dto.getFirstName(),
                        dto.getSecondName(),
                        dto.getUsername(),
                        dto.getPassword()));
        return new UserSignUpResponseDto(user.getUsername(),user.getFirstName(),user.getSecondName());
    }
}
