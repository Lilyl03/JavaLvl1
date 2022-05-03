package com.aca.homework.exam.exam3.service.core;

import com.aca.homework.exam.exam3.entity.User;
import com.aca.homework.exam.exam3.service.core.params.CreateUserParams;

public interface UserService {
    User create(CreateUserParams params);
}
