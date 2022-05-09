package com.aca.homework.week18.website.facade.core;

import com.aca.homework.week18.website.facade.request.UserSignUpRequestDto;
import com.aca.homework.week18.website.facade.response.UserSignUpResponseDto;

public interface UserFacade {
    UserSignUpResponseDto signUp(UserSignUpRequestDto dto);
}
