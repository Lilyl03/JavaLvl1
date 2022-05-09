package com.aca.homework.week18.website.repository;



import com.aca.homework.week18.website.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
    Long countById(Long id);
    List<Image> findAllByPostId(Long id);
}
