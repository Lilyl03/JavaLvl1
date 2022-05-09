package com.aca.homework.week18.website.facade.request;

import com.aca.homework.week18.website.entity.Image;
import com.aca.homework.week18.website.entity.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PostCreationRequestDto {
    private  String title;
    private  String description;
    private List<Image> images;
    private final User user;


    public PostCreationRequestDto(String title, String description, User user) {
        this.title = title;
        this.description = description;
        this.user = user;
    }

    public PostCreationRequestDto(User user) {
        this.user = user;
    }

    public PostCreationRequestDto(String title, String description, List<Image> images, User user) {
        this.title = title;
        this.description = description;
        this.images = images;
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<Image> getImages() {
        return images;
    }

    public User getUser() {
        return user;
    }
}
