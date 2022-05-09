package com.aca.homework.week18.website.service.impl;

import  com.aca.homework.week18.website.entity.Image;
import  com.aca.homework.week18.website.entity.Post;
import  com.aca.homework.week18.website.repository.ImageRepository;
import  com.aca.homework.week18.website.repository.PostRepository;
import  com.aca.homework.week18.website.repository.UserRepository;
import  com.aca.homework.week18.website.service.core.ImageService;
import  com.aca.homework.week18.website.service.core.params.CreateImageParams;

import java.util.List;

public class ImageServiceImpl implements ImageService {
    private PostRepository postRepository;
    private ImageRepository imageRepository;
    private UserRepository userRepository;
    @Override
    public Image create(CreateImageParams params) {
        Post post = new PostServiceImpl(postRepository,userRepository).getById(params.getPostId());
        Image image = new Image(params.getBlobId(), post);
        imageRepository.save(image);
        return image;
    }

    @Override
    public Long count(Long id) {
        return imageRepository.countById(id);
    }

    @Override
    public List<Image> getAllByPostId(Long id) {
        List<Image> allByPostId = imageRepository.findAllByPostId(id);
        return allByPostId;
    }
}
