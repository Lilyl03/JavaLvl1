package com.aca.homework.week18.website.entity;

import javax.persistence.*;

@Entity
@Table(name = "IMAGES")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "blob_id")
    private String blobId;

    @Column(name = "post_id")
    private Long postId;

    public Image() {
    }

    public Image(String blobId,Long postId) {
        this.blobId = blobId;
        this.postId = postId;
    }

    public Long getId() {
        return id;
    }

    public String getBlobId() {
        return blobId;
    }

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", blobId='" + blobId + '\'' +
                '}';
    }
}
