package com.aca.homework.week18.website.service.core;


import com.aca.homework.week18.website.entity.Image;
import com.aca.homework.week18.website.service.core.params.CreateImageParams;

import java.util.List;

public interface ImageService {
    Image create(CreateImageParams params);
    Long count(Long id);
    List<Image> getAllByPostId(Long id);
}
