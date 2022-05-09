package com.aca.homework.week18.website.service.impl;

import com.aca.homework.week18.website.entity.User;
import com.aca.homework.week18.website.repository.UserRepository;
import com.aca.homework.week18.website.service.core.UserService;
import com.aca.homework.week18.website.service.core.params.CreateUserParams;
import org.springframework.data.domain.Example;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public User create(CreateUserParams params) {
        User user = new User(params.getFirstName(), params.getSecondName(), params.getUsername(), params.getPassword());
        userRepository.save(user);
        return user;
    }
}
