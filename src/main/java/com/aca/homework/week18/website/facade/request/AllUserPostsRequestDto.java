package com.aca.homework.week18.website.facade.request;

public class AllUserPostsRequestDto {
    private Long user_id;

    public AllUserPostsRequestDto(Long user_id) {
        this.user_id = user_id;
    }

    public Long getUser_id() {
        return user_id;
    }
}
