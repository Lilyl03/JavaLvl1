package com.aca.homework.week18.website.facade.response;

import com.aca.homework.week18.website.entity.Post;
import com.aca.homework.week18.website.entity.User;

import java.util.List;

public class AllUserPostsResponseDto {
    private User user;
    private List<Post> posts;


    public AllUserPostsResponseDto(User user, List<Post> posts) {
        this.user = user;
        this.posts = posts;
    }
}
