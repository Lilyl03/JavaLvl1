package com.aca.homework.week18.website.facade.impl;

import com.aca.homework.week18.website.entity.Image;
import com.aca.homework.week18.website.entity.Post;
import com.aca.homework.week18.website.entity.User;
import com.aca.homework.week18.website.facade.core.PostFacade;
import com.aca.homework.week18.website.facade.request.ImageCreationrequestDto;
import com.aca.homework.week18.website.facade.request.PostCreationRequestDto;
import com.aca.homework.week18.website.facade.response.ImageCreationResponseDto;
import com.aca.homework.week18.website.facade.response.PostCreationResponseDto;
import com.aca.homework.week18.website.facade.response.UserSignUpResponseDto;
import com.aca.homework.week18.website.repository.ImageRepository;
import com.aca.homework.week18.website.repository.PostRepository;
import com.aca.homework.week18.website.service.core.params.CreateImageParams;
import com.aca.homework.week18.website.service.core.params.CreatePostParams;
import com.aca.homework.week18.website.service.impl.ImageServiceImpl;
import com.aca.homework.week18.website.service.impl.PostServiceImpl;

import java.util.Collections;
import java.util.List;

public class PostFacadeImpl implements PostFacade {
    private ImageRepository imageRepository;
    private PostRepository postRepository;

    private UserSignUpResponseDto userSignUpResponseDto;
    @Override
    public PostCreationResponseDto create(PostCreationRequestDto dto) {
        Post post = new PostServiceImpl().create(new CreatePostParams(dto.getTitle(), dto.getDescription(), dto.getImages()));
        return new PostCreationResponseDto(post);
    }



    @Override
    public PostCreationResponseDto getAllUserPosts(PostCreationRequestDto dto) {
        User user = dto.getUser();
        List<Post> posts = postRepository.findAllById(Collections.singleton(user.getId()));
        return new PostCreationResponseDto(user, posts);
    }

    @Override
    public ImageCreationResponseDto uploadImage(ImageCreationrequestDto dto) {
        if(imageRepository.countByPostId() >5){
            throw new RuntimeException("The maximum count of images must be 5");
        }
        Image image = new ImageServiceImpl().create(new CreateImageParams(dto.getBlobId(), dto.getPostId()));
        return new ImageCreationResponseDto(image);
    }

}
