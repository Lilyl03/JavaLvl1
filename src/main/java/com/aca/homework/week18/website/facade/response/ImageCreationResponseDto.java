package com.aca.homework.week18.website.facade.response;

import java.util.List;
import java.util.Objects;

public class ImageCreationResponseDto {
    private String blobId;
    private List<String> errors;

    public ImageCreationResponseDto(List<String> errors) {
        this.errors = errors;
    }

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
        return Objects.equals(blobId, that.blobId) && Objects.equals(errors, that.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blobId, errors);
    }

    @Override
    public String toString() {
        return "ImageCreationResponseDto{" + "blobId='" + blobId + '\'' + ", errors=" + errors + '}';
    }
}
