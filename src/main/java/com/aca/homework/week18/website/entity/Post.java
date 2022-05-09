package com.aca.homework.week18.website.entity;

import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.Delimiter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "POSTS")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;


    @Column(name = "image")
    private List<Image> images;

    public Post(String title, String description, List<Image> images) {
        this.title = title;
        this.description = description;
        this.images = images;
    }

    public Long getId() {
        return id;
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
