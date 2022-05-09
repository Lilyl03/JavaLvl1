package com.aca.homework.week18.website.service.core.params;

import com.aca.homework.week18.website.entity.Image;

import java.util.List;
import java.util.Objects;

public class CreatePostParams {
    private String title;
    private String description;
    private List<Image> images;

    public CreatePostParams(String title, String description, List<Image> images) {
        this.title = title;
        this.description = description;
        this.images = images;
    }

    public CreatePostParams() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
