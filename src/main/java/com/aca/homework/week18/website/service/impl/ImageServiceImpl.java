package com.aca.homework.week18.website.service.impl;

import com.aca.homework.week18.website.entity.Image;
import com.aca.homework.week18.website.repository.ImageRepository;
import com.aca.homework.week18.website.service.core.ImageService;
import com.aca.homework.week18.website.service.core.params.CreateImageParams;

public class ImageServiceImpl implements ImageService {
    ImageRepository imageRepository;
    @Override
    public Image create(CreateImageParams params) {
        Image image = new Image(params.getBlobId(),params.getPostId());
        imageRepository.save(image);
        return image;
    }
}
