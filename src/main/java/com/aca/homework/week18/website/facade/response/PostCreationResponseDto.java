package com.aca.homework.week18.website.facade.response;

public class PostCreationResponseDto {
    private String title;
    private String description;

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
}
