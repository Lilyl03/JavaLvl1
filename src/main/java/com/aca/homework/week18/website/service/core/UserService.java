package com.aca.homework.week18.website.service.core;


import com.aca.homework.week18.website.entity.User;
import com.aca.homework.week18.website.service.core.params.CreateUserParams;

public interface UserService {
    User create(CreateUserParams params);
    User getById(Long id);
}
