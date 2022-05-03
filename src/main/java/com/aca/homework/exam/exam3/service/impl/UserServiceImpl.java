package com.aca.homework.exam.exam3.service.impl;

import com.aca.homework.exam.exam3.entity.User;
import com.aca.homework.exam.exam3.repository.UserRepository;
import com.aca.homework.exam.exam3.service.core.UserService;
import com.aca.homework.exam.exam3.service.core.params.CreateUserParams;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public User create(CreateUserParams params) {
        User user = new User(params.getFirstName(), params.getSecondName(), params.getPassportId(), params.getNumberPlate());
        userRepository.save(user);
        return user;
    }
}
