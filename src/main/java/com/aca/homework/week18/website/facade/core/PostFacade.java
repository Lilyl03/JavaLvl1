package com.aca.homework.week18.website.facade.core;

import com.aca.homework.week18.website.facade.request.ImageCreationrequestDto;
import com.aca.homework.week18.website.facade.request.PostCreationRequestDto;
import com.aca.homework.week18.website.facade.request.UserSignUpRequestDto;
import com.aca.homework.week18.website.facade.response.ImageCreationResponseDto;
import com.aca.homework.week18.website.facade.response.PostCreationResponseDto;
import com.aca.homework.week18.website.facade.response.UserSignUpResponseDto;

public interface PostFacade {
     PostCreationResponseDto create(PostCreationRequestDto dto);

    PostCreationResponseDto getAllUserPosts(PostCreationRequestDto dto);

    ImageCreationResponseDto uploadImage(ImageCreationrequestDto dto);

}
