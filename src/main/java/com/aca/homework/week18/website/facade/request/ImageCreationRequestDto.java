package com.aca.homework.week18.website.facade.request;

import java.util.Objects;

public class ImageCreationRequestDto {
    private final Long postId;
    private final String blobId;

    public ImageCreationRequestDto(Long postId, String blobId) {
        this.postId = postId;
        this.blobId = blobId;
    }

    public Long getPostId() {
        return postId;
    }

    public String getBlobId() {
        return blobId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImageCreationRequestDto that = (ImageCreationRequestDto) o;
        return Objects.equals(postId, that.postId) && Objects.equals(blobId, that.blobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, blobId);
    }

    @Override
    public String toString() {
        return "ImageCreationRequestDto{" + "postId=" + postId + ", blobId='" + blobId + '\'' + '}';
    }
}
