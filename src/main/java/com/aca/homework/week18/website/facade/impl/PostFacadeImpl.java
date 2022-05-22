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
import com.aca.homework.week18.website.facade.response.PostAndImage;
import com.aca.homework.week18.website.facade.response.PostCreationResponseDto;
import com.aca.homework.week18.website.repository.ImageRepository;
import com.aca.homework.week18.website.repository.PostRepository;
import com.aca.homework.week18.website.repository.UserRepository;
import com.aca.homework.week18.website.service.core.ImageService;
import com.aca.homework.week18.website.service.core.PostService;
import com.aca.homework.week18.website.service.core.UserService;
import com.aca.homework.week18.website.service.core.params.CreateImageParams;
import com.aca.homework.week18.website.service.core.params.CreatePostParams;
import com.aca.homework.week18.website.service.impl.ImageServiceImpl;
import com.aca.homework.week18.website.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PostFacadeImpl implements PostFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(ImageServiceImpl.class);

    private final ImageRepository imageRepository;
    private final UserRepository userRepository;
    private final PostRepository postRepository;
    private final ImageService imageService;
    private final PostService postService;
    private final UserService userService;

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
        LOGGER.info("Creating the post for the provided request - {}", dto);
        if (!userRepository.existsById(dto.getUser_id())) {
            return new PostCreationResponseDto(List.of("The user does not exist"));
        }
        Post post = postService.create(new CreatePostParams(dto.getTitle(), dto.getDescription(), dto.getUser_id()));
        LOGGER.info("Successfully created the post for the provided request - {}", dto);
        return new PostCreationResponseDto(dto.getTitle(), dto.getDescription());
    }

    @Override
    public ImageCreationResponseDto uploadImage(ImageCreationRequestDto dto) {
        LOGGER.info("Uploading the image for the provided request - {}", dto);
        Long count = imageService.countByPostId(dto.getPostId());
        if (count.equals(5L)) {
            return new ImageCreationResponseDto(List.of("The maximum value is 5"));
        }
        Image image = imageService.create(new CreateImageParams(dto.getBlobId(), dto.getPostId()));
        LOGGER.info("Successfully uploaded the image for the provided request - {}", dto);
        return new ImageCreationResponseDto(image.getBlobId());
    }

    @Override
    public AllUserPostsResponseDto getAllUserPosts(AllUserPostsRequestDto dto) {
        LOGGER.info("Retrieving all posts by the user for the provided request - {}", dto);
        User user = new UserServiceImpl(userRepository).getById(dto.getUser_id());
        List<Post> allById = postService.getAllById(user.getId());
        List<PostAndImage> postAndImages = new ArrayList<>();
        for (Post post : allById) {
            List<Image> allByPostId = imageService.getAllByPostId(post.getId());
            postAndImages.add(new PostAndImage(post, allByPostId));
        }
        LOGGER.info("Successfully retrieved all posts by the user for the provided request - {}", dto);
        return new AllUserPostsResponseDto(user, postAndImages);
    }


}
