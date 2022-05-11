package com.aca.homework.week18.website.facade.request;

import java.util.Objects;

public class AllUserPostsRequestDto {
    private Long user_id;

    public AllUserPostsRequestDto(Long user_id) {
        this.user_id = user_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllUserPostsRequestDto that = (AllUserPostsRequestDto) o;
        return Objects.equals(user_id, that.user_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id);
    }

    @Override
    public String toString() {
        return "AllUserPostsRequestDto{" +
                "user_id=" + user_id +
                '}';
    }
}
