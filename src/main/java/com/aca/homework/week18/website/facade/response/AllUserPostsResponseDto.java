package com.aca.homework.week18.website.facade.response;

import com.aca.homework.week18.website.entity.User;

import java.util.Arrays;
import java.util.List;

public class AllUserPostsResponseDto {
    private final User user;
    private final List<PostAndImage> postAndImages;

    public AllUserPostsResponseDto(User user, List<PostAndImage> postAndImages) {
        this.user = user;
        this.postAndImages = postAndImages;
    }

    public User getUser() {
        return user;
    }

    public List<PostAndImage> getPostAndImages() {
        return postAndImages;
    }

    @Override
    public String toString() {
        return user + "," + Arrays.toString(postAndImages.toArray());
    }
}
