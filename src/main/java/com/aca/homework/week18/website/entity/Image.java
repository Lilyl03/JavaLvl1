package com.aca.homework.week18.website.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "IMAGES")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "blob_id")
    private String blobId;

    @ManyToOne
    @JoinColumn(name = "post_id", foreignKey = @ForeignKey(name = "FK_IMAGE_POST_ID_ID"))
    private Post post;

    public Image(String blobId, Post post) {
        this.blobId = blobId;
        this.post = post;
    }

    public Image() {}

    public Long getId() {
        return id;
    }

    public String getBlobId() {
        return blobId;
    }

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return Objects.equals(id, image.id) && Objects.equals(blobId, image.blobId) && Objects.equals(post, image.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, blobId, post);
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", blobId='" + blobId + '\'' +
                ", post=" + post +
                '}';
    }
}
