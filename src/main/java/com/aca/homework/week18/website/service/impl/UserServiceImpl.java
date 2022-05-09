package com.aca.homework.week18.website.service.impl;

import com.aca.homework.week18.website.entity.User;
import com.aca.homework.week18.website.repository.UserRepository;
import com.aca.homework.week18.website.service.core.UserService;
import com.aca.homework.week18.website.service.core.params.CreateUserParams;

import java.util.Optional;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(CreateUserParams params) {
        User user = new User(params.getFirstName(), params.getSecondName(), params.getUsername(), params.getPassword());
        userRepository.save(user);
        return user;
    }

    @Override
    public User getById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }
}
