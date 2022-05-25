package com.aca.homework.week18.website.facade.response;

import java.util.List;
import java.util.Objects;

public class PostCreationResponseDto {
    private String title;
    private String description;
    private List<String> errors;

    public PostCreationResponseDto(List<String> errors) {
        this.errors = errors;
    }

    public PostCreationResponseDto(String title, String description) {
        this.title = title;
        this.description = description;
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
        PostCreationResponseDto that = (PostCreationResponseDto) o;
        return Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(errors, that.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, errors);
    }

    @Override
    public String toString() {
        return "PostCreationResponseDto{" + "title='" + title + '\'' + ", description='" + description + '\'' + ", errors=" + errors + '}';
    }
}
