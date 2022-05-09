package com.aca.homework.week18.website.facade.response;

public class ImageCreationResponseDto {
    private String blobId;

    public ImageCreationResponseDto(String blobId) {
        this.blobId = blobId;
    }

    public String getBlobId() {
        return blobId;
    }
}
