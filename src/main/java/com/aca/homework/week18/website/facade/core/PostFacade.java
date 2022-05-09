package com.aca.homework.week18.website.facade.core;

import com.aca.homework.week18.website.facade.request.AllUserPostsRequestDto;
import com.aca.homework.week18.website.facade.request.ImageCreationRequestDto;
import com.aca.homework.week18.website.facade.request.PostCreationRequestDto;
import com.aca.homework.week18.website.facade.response.AllUserPostsResponseDto;
import com.aca.homework.week18.website.facade.response.ImageCreationResponseDto;
import com.aca.homework.week18.website.facade.response.PostCreationResponseDto;

public interface PostFacade {
    PostCreationResponseDto create(PostCreationRequestDto dto);
    ImageCreationResponseDto uploadImage(ImageCreationRequestDto dto);
    AllUserPostsResponseDto getAllUserPosts(AllUserPostsRequestDto dto);
}
