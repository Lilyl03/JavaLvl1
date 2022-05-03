package com.aca.homework.exam.exam3.facade;

import com.aca.homework.exam.exam3.entity.UserPlateNumber;

public class UserPlateNumberResponseDto {
    private UserPlateNumber userPlateNumber;

    public UserPlateNumberResponseDto(UserPlateNumber userPlateNumber) {
        this.userPlateNumber = userPlateNumber;

    }

    public UserPlateNumber getUserPlateNumber() {
        return userPlateNumber;
    }

    public void setUserPlateNumber(UserPlateNumber userPlateNumber) {
        this.userPlateNumber = userPlateNumber;
    }
}
