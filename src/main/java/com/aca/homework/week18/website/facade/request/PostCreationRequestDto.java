package com.aca.homework.week18.website.facade.request;

import java.util.Objects;

public class PostCreationRequestDto {
    private final Long user_id;
    private final String title;
    private final String description;

    public PostCreationRequestDto(Long user_id, String title, String description) {
        this.user_id = user_id;
        this.title = title;
        this.description = description;
    }

    public Long getUser_id() {
        return user_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostCreationRequestDto that = (PostCreationRequestDto) o;
        return Objects.equals(user_id, that.user_id) && Objects.equals(title, that.title) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, title, description);
    }

    @Override
    public String toString() {
        return "PostCreationRequestDto{" + "user_id=" + user_id + ", title='" + title + '\'' + ", description='" + description + '\'' + '}';
    }
}
