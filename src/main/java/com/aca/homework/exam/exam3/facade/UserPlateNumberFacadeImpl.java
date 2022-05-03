package com.aca.homework.exam.exam3.facade;

import com.aca.homework.exam.exam3.entity.NumberPlate;
import com.aca.homework.exam.exam3.entity.User;
import com.aca.homework.exam.exam3.entity.UserPlateNumber;
import com.aca.homework.exam.exam3.repository.UserPlateNumberRepository;
import com.aca.homework.exam.exam3.service.core.NumberPlateService;
import com.aca.homework.exam.exam3.service.core.UserService;
import com.aca.homework.exam.exam3.service.core.params.CreateUserParams;
import com.aca.homework.exam.exam3.service.impl.UserServiceImpl;

public class UserPlateNumberFacadeImpl implements UserPlateNumberFacade{
    UserPlateNumberRepository userPlateNumberRepository;

    @Override
    public UserPlateNumberResponseDto takeTheNumber(UserPlateNumberRequestDto dto) {

        if(userPlateNumberRepository.findByNumberPlate(dto.getPlateNumber()).getUser().getPassportId().isBlank()){
            NumberPlate numberPlate = new NumberPlate(dto.getPlateNumber());
            User user = new UserServiceImpl().create(new CreateUserParams(dto.getFirstName(),dto.getSecondName(), dto.getPassportId(), new NumberPlate(dto.getPlateNumber())));
            return new UserPlateNumberResponseDto(new UserPlateNumber(user, new NumberPlate(dto.getPlateNumber())));
        }
        return new UserPlateNumberResponseDto(userPlateNumberRepository.findByNumberPlate(dto.getPlateNumber()));
    }
}
