package com.aca.homework.week18.website.facade.response;

import java.util.Objects;

public class ImageCreationResponseDto {
    private String blobId;

    public ImageCreationResponseDto(String blobId) {
        this.blobId = blobId;
    }

    public String getBlobId() {
        return blobId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImageCreationResponseDto that = (ImageCreationResponseDto) o;
        return Objects.equals(blobId, that.blobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blobId);
    }

    @Override
    public String toString() {
        return "ImageCreationResponseDto{" +
                "blobId='" + blobId + '\'' +
                '}';
    }
}
