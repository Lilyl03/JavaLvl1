package com.aca.homework.week18.website.facade.response;

import com.aca.homework.week18.website.entity.Image;
import com.aca.homework.week18.website.entity.Post;
import com.aca.homework.week18.website.entity.User;

import java.util.List;

public class PostCreationResponseDto {
    private List<Post> posts;

    private User user;

    public PostCreationResponseDto(User user, List<Post> post) {
        this.user = user;
        this.posts = posts;
    }

    public PostCreationResponseDto(Post post) {
        this.posts.add(post);
    }
}
