package com.aca.homework.week18.website.facade.response;

import com.aca.homework.week18.website.entity.Image;

import java.util.List;

public class ImageCreationResponseDto {
    private List<Image> images;

    public ImageCreationResponseDto(Image image) {
        this.images.add(image);
    }

    public List<Image> getImage() {
        return images;
    }
}
