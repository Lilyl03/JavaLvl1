package com.aca.homework.exam.exam3.service.core;

import com.aca.homework.exam.exam3.entity.UserPlateNumber;
import com.aca.homework.exam.exam3.service.core.params.CreateUserPlateNumberParams;

public interface UserPlateNumberService {
    UserPlateNumber create(CreateUserPlateNumberParams params);
}
