package com.aca.homework.week18.website.facade.request;

public class ImageCreationRequestDto {
    private Long postId;
    private String blobId;

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
}
