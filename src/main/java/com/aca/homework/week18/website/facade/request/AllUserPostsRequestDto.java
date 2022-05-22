package com.aca.homework.week18.website.facade.request;

import java.util.Objects;

public class AllUserPostsRequestDto {
    private final Long userId;

    public AllUserPostsRequestDto(Long userId) {
        this.userId = userId;
    }

    public Long getUser_id() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllUserPostsRequestDto that = (AllUserPostsRequestDto) o;
        return Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        return "AllUserPostsRequestDto{" + "userId=" + userId + '}';
    }
}
