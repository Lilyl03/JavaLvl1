package com.aca.homework.week18.website.service.impl;

import com.aca.homework.week18.website.entity.Post;
import com.aca.homework.week18.website.repository.PostRepository;
import com.aca.homework.week18.website.service.core.PostService;
import com.aca.homework.week18.website.service.core.params.CreatePostParams;

public class PostServiceImpl implements PostService {
    private PostRepository postRepository;
    @Override
    public Post create(CreatePostParams params) {
        Post post = new Post(params.getTitle(), params.getDescription(),params.getImages());
        postRepository.save(post);
        return post;
    }
}
