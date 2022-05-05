package com.aca.homework.exam.exam3.service.impl;

import com.aca.homework.exam.exam3.entity.UserPlateNumber;
import com.aca.homework.exam.exam3.repository.UserPlateNumberRepository;
import com.aca.homework.exam.exam3.service.core.UserPlateNumberService;
import com.aca.homework.exam.exam3.service.core.params.CreateUserPlateNumberParams;

public class UserPlateNumberServiceImpl implements UserPlateNumberService {

    private UserPlateNumberRepository userPlateNumberRepository;

    @Override
    public UserPlateNumber create(CreateUserPlateNumberParams params) {
        UserPlateNumber userPlateNumber = new UserPlateNumber(params.getUser(),params.getNumberPlate());
        userPlateNumberRepository.save(userPlateNumber);
        return userPlateNumber;
    }

}
