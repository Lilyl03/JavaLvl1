package com.aca.homework.week18.website.service.core.params;

import java.util.Objects;

public class CreateImageParams {
    private String blobId;
    private Long postId;

    public CreateImageParams(String blobId, Long postId) {
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
