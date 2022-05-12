package com.aca.homework.week18.website.service.impl;

import com.aca.homework.week18.website.entity.Image;
import com.aca.homework.week18.website.entity.Post;
import com.aca.homework.week18.website.repository.ImageRepository;
import com.aca.homework.week18.website.repository.PostRepository;
import com.aca.homework.week18.website.repository.UserRepository;
import com.aca.homework.week18.website.service.core.ImageService;
import com.aca.homework.week18.website.service.core.params.CreateImageParams;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
    private PostRepository postRepository;
    private ImageRepository imageRepository;
    private UserRepository userRepository;

    public ImageServiceImpl(PostRepository postRepository, ImageRepository imageRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.imageRepository = imageRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Image create(CreateImageParams params) {
        Post post = new PostServiceImpl(postRepository,userRepository).getById(params.getPostId());
            Image image = new Image(params.getBlobId(), post);
            imageRepository.save(image);
            return image;
    }

    @Override
    public Long count(Long id) {
        return imageRepository.countByPostId(id);
    }

    @Override
    public List<Image> getAllByPostId(Long id) {
        return imageRepository.findAllByPostId(id);
    }
}
