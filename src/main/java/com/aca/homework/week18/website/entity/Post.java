package com.aca.homework.week18.website.entity;

import org.springframework.util.Assert;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "POSTS")
public class Post {
    @Id
    @SequenceGenerator(name = "pst_sequence", sequenceName = "pst_sequence")
    @GeneratedValue(generator = "pst_sequence",strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "FK_POST_USER_ID_ID"))
    private User user;

    @OneToMany(fetch=FetchType.EAGER)
    @JoinColumn(name = "image_id", foreignKey = @ForeignKey(name = "FK_POST_IMAGE_ID_ID"))
    private List<Image> images;

    public Post(String title, String description, User user) {
        Assert.notNull(title,"The title should not be null");
        Assert.notNull(description,"The description should not be null");
        Assert.notNull(user,"The user should not be null");
        this.title = title;
        this.description = description;
        this.user = user;
    }

    public Post() {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id) && Objects.equals(title, post.title) && Objects.equals(description, post.description) && Objects.equals(user, post.user) && Objects.equals(images, post.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, user, images);
    }


    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                ", images=" + images +
                '}';
    }
}

















































