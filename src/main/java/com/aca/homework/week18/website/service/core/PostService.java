package com.aca.homework.week18.website.service.core;


import com.aca.homework.week18.website.entity.Post;
import com.aca.homework.week18.website.service.core.params.CreatePostParams;

public interface PostService {
    Post create(CreatePostParams params);
}
