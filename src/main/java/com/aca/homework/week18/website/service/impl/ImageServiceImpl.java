package com.aca.homework.week18.website.service.impl;

import com.aca.homework.week18.website.entity.Image;
import com.aca.homework.week18.website.entity.Post;
import com.aca.homework.week18.website.repository.ImageRepository;
import com.aca.homework.week18.website.service.core.ImageService;
import com.aca.homework.week18.website.service.core.PostService;
import com.aca.homework.week18.website.service.core.UserService;
import com.aca.homework.week18.website.service.core.params.CreateImageParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ImageServiceImpl.class);

    private final PostService postService;
    private final ImageRepository imageRepository;
    private final UserService userService;

    public ImageServiceImpl(PostService postService, ImageRepository imageRepository, UserService userService) {
        this.postService = postService;
        this.imageRepository = imageRepository;
        this.userService = userService;
    }


    @Override
    public Image create(CreateImageParams params) {
        LOGGER.info("Creating an image for the provided params {}", params);
        Post post = postService.getById(params.getPostId());
        Image savedImage = imageRepository.save(new Image(params.getBlobId(), post));
        LOGGER.info("Successfully created an image for the provided params {}", params);
        return savedImage;
    }

    @Override
    public Long countByPostId(Long id) {
        return imageRepository.countByPostId(id);
    }

    @Override
    public List<Image> getAllByPostId(Long id) {
        return imageRepository.findAllByPostId(id);
    }
}
