package com.aca.homework.week18.website.facade.request;

public class ImageCreationrequestDto {
    private final String blobId;
    private final Long postId;

    public ImageCreationrequestDto( String blobId,Long postId) {
        this.blobId = blobId;
        this.postId = postId;
    }

    public Long getPostId() {
        return postId;
    }

    public String getBlobId() {
        return blobId;
    }
}
