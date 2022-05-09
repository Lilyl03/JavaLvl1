package com.aca.homework.week18.website.facade.request;

public class PostCreationRequestDto {
    private Long user_id;
    private String title;
    private String description;

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
}
