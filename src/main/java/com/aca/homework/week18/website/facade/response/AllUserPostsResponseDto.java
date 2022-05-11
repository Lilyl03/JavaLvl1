package com.aca.homework.week18.website.facade.response;

import com.aca.homework.week18.website.entity.User;

import java.util.Arrays;
import java.util.List;

public class AllUserPostsResponseDto {
    private User user;
    private List<PostAndImage> postAndImages;

    public User getUser() {
        return user;
    }

    public List<PostAndImage> getPostAndImages() {
        return postAndImages;
    }

    public AllUserPostsResponseDto(User user, List<PostAndImage> postAndImages) {
        this.user = user;
        this.postAndImages = postAndImages;
    }

    @Override
    public String toString() {
        return "AllUserPostsResponseDto{\n" +
                "user=" + user +
                "\n " + Arrays.toString(postAndImages.toArray()) +
                '}';
    }
}
