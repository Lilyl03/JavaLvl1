package com.aca.homework.week18.website.service.impl;

import com.aca.homework.week18.website.entity.Post;
import com.aca.homework.week18.website.entity.User;
import com.aca.homework.week18.website.repository.PostRepository;
import com.aca.homework.week18.website.service.core.PostService;
import com.aca.homework.week18.website.service.core.UserService;
import com.aca.homework.week18.website.service.core.params.CreatePostParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostServiceImpl.class);

    private final PostRepository postRepository;
    private final UserService userService;

    public PostServiceImpl(PostRepository postRepository, UserService userService) {
        this.postRepository = postRepository;
        this.userService = userService;
    }

    @Override
    public Post create(CreatePostParams params) {
        LOGGER.info("Creating a post for the provided params {}", params);
        User user = userService.getById(params.getUserId());
        Post savedPost = postRepository.save(new Post(params.getTitle(), params.getDescription(), user));
        LOGGER.info("Successfully created an image for the provided params {}", params);
        return savedPost;
    }

    @Override
    public Post getById(Long id) {
        LOGGER.info("Retrieving the post for the provided id {}", id);
        Optional<Post> byId = postRepository.findById(id);
        if (byId.isEmpty()) {
            throw new RuntimeException("User with such an id doesn't exist");
        }
        LOGGER.info("Successfully retrieved the post for the provided id {}", id);
        return byId.get();
    }

    @Override
    public List<Post> getAllById(Long id) {
        return postRepository.findAllByUserId(id);
    }
}
