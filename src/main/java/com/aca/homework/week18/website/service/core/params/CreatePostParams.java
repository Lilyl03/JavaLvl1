package com.aca.homework.week18.website.service.core.params;

import org.springframework.util.Assert;

import java.util.Objects;

public class CreatePostParams {
    private String title;
    private String description;
    private Long userId;

    public CreatePostParams(String title, String description, Long userId) {
        Assert.notNull(title,"The title should not be null");
        Assert.notNull(description,"The description should not be null");
        Assert.notNull(userId,"The userId should not be null");
        this.title = title;
        this.description = description;
        this.userId = userId;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreatePostParams that = (CreatePostParams) o;
        return Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, userId);
    }

    @Override
    public String toString() {
        return "CreatePostParams{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", userId=" + userId +
                '}';
    }
}
