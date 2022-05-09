package com.aca.homework.week18.website.facade.impl;

import com.aca.homework.week18.website.entity.Image;
import com.aca.homework.week18.website.entity.Post;
import com.aca.homework.week18.website.entity.User;
import com.aca.homework.week18.website.facade.core.PostFacade;
import com.aca.homework.week18.website.facade.request.AllUserPostsRequestDto;
import com.aca.homework.week18.website.facade.request.ImageCreationRequestDto;
import com.aca.homework.week18.website.facade.request.PostCreationRequestDto;
import com.aca.homework.week18.website.facade.response.AllUserPostsResponseDto;
import com.aca.homework.week18.website.facade.response.ImageCreationResponseDto;
import com.aca.homework.week18.website.facade.response.PostCreationResponseDto;
import com.aca.homework.week18.website.repository.ImageRepository;
import com.aca.homework.week18.website.repository.PostRepository;
import com.aca.homework.week18.website.repository.UserRepository;
import com.aca.homework.week18.website.service.core.ImageService;
import com.aca.homework.week18.website.service.core.PostService;
import com.aca.homework.week18.website.service.core.UserService;
import com.aca.homework.week18.website.service.core.params.CreateImageParams;
import com.aca.homework.week18.website.service.core.params.CreatePostParams;

import java.util.List;

public class PostFacadeImpl implements PostFacade {
    private ImageRepository imageRepository;
    private UserRepository userRepository;
    private PostRepository postRepository;
    private ImageService imageService;
    private PostService postService;
    private UserService userService;

    public PostFacadeImpl(ImageRepository imageRepository, UserRepository userRepository, PostRepository postRepository, ImageService imageService, PostService postService, UserService userService) {
        this.imageRepository = imageRepository;
        this.userRepository = userRepository;
        this.postRepository = postRepository;
        this.imageService = imageService;
        this.postService = postService;
        this.userService = userService;
    }

    @Override
    public PostCreationResponseDto create(PostCreationRequestDto dto) {
        if(!userRepository.existsById(dto.getUser_id())){
            throw new RuntimeException("The user was not found");
        }
        Post post = postService.create(new CreatePostParams(dto.getTitle(), dto.getDescription(), dto.getUser_id()));
        return new PostCreationResponseDto(dto.getTitle(), dto.getDescription());
    }

    @Override
    public ImageCreationResponseDto uploadImage(ImageCreationRequestDto dto) {
        if(imageRepository.countById(dto.getPostId())>5){
            throw new RuntimeException("The image upload maximum value is 5");
        }
        Image image = imageService.create(new CreateImageParams(dto.getBlobId(), dto.getPostId()));
        return new ImageCreationResponseDto(image.getBlobId());
    }

    @Override
    public AllUserPostsResponseDto getAllUserPosts(AllUserPostsRequestDto dto) {
        User user = userRepository.getById(dto.getUser_id());
        List<Post> allById = postService.getAllById(user.getId());
        for (Post post : allById) {
            List<Image> allByPostId = imageService.getAllByPostId(post.getId());
            post.setImages(allByPostId);
        }
        return new AllUserPostsResponseDto(user,allById);
    }


}
