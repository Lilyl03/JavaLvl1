package com.aca.homework.week18.website.entity;

import org.springframework.util.Assert;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "IMAGES")
public class Image {
    @Id
    @SequenceGenerator(name = "img_sequence", sequenceName = "img_sequence")
    @GeneratedValue(generator = "img_sequence", strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "blob_id", nullable = false)
    private String blobId;

    @ManyToOne()
    @JoinColumn(name = "post_id", nullable = false, foreignKey = @ForeignKey(name = "FK_IMAGE_POST_ID_ID"))
    private Post post;

    public Image(String blobId, Post post) {
        Assert.notNull(blobId, "The blobId should not be null");
        Assert.notNull(post, "The post should not be null");
        this.blobId = blobId;
        this.post = post;
    }

    public Image() {
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
        return "\nImage{" + "id=" + id + ", blobId='" + blobId + '\'' + ", post=" + post + '}';
    }
}
