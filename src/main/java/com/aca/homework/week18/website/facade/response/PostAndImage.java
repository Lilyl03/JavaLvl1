package com.aca.homework.week18.website.facade.response;


import com.aca.homework.week18.website.entity.Image;
import com.aca.homework.week18.website.entity.Post;

import java.util.Arrays;
import java.util.List;

public class PostAndImage {
    private Post post;
    private List<Image> images;

    public PostAndImage(Post post, List<Image> images) {
        this.post = post;
        this.images = images;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return post + ", images=" + Arrays.toString(images.toArray()) + '}';
    }
}
