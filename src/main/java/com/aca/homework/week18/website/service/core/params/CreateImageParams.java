package com.aca.homework.week18.website.service.core.params;

import org.springframework.util.Assert;

import java.util.Objects;

public class CreateImageParams {
    private String blobId;
    private Long postId;

    public CreateImageParams(String blobId, Long postId) {
        Assert.notNull(blobId,"The blobId should not be null");
        Assert.notNull(postId,"The postId should not be null");
        this.blobId = blobId;
        this.postId = postId;
    }

    public String getBlobId() {
        return blobId;
    }

    public Long getPostId() {
        return postId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateImageParams that = (CreateImageParams) o;
        return Objects.equals(blobId, that.blobId) && Objects.equals(postId, that.postId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blobId, postId);
    }

    @Override
    public String toString() {
        return "CreateImageParams{" +
                "blobId='" + blobId + '\'' +
                ", postId=" + postId +
                '}';
    }
}
