package com.aca.homework.week18.website.service.core.params;

import java.util.Objects;

public class CreateImageParams {
    private String blobId;
    private Long postId;

    public CreateImageParams(String blobId,Long postId) {
        this.blobId = blobId;
        this.postId = postId;
    }

    public CreateImageParams() {
    }

    public String getBlobId() {
        return blobId;
    }

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }
}
