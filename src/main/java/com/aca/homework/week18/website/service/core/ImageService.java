package com.aca.homework.week18.website.service.core;


import com.aca.homework.week18.website.entity.Image;
import com.aca.homework.week18.website.service.core.params.CreateImageParams;

public interface ImageService {
    Image create(CreateImageParams params);
}
