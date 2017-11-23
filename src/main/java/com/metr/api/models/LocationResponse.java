package com.metr.api.models;

import java.math.BigDecimal;

public class LocationResponse {

    private Double latitude;
    private Double longitude;
    private String locationTitle;
    private String locationDescription;
    private Long locationId;
    private BigDecimal locationPrice;
    private Double locationRating;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getLocationTitle() {
        return locationTitle;
    }

    public void setLocationTitle(String locationTitle) {
        this.locationTitle = locationTitle;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public BigDecimal getLocationPrice() {
        return locationPrice;
    }

    public void setLocationPrice(BigDecimal locationPrice) {
        this.locationPrice = locationPrice;
    }

    public Double getLocationRating() {
        return locationRating;
    }

    public void setLocationRating(Double locationRating) {
        this.locationRating = locationRating;
    }

    @Override
    public String toString() {
        return "LocationResponse{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", locationTitle='" + locationTitle + '\'' +
                ", locationDescription='" + locationDescription + '\'' +
                ", locationId=" + locationId +
                ", locationPrice=" + locationPrice +
                ", locationRating=" + locationRating +
                '}';
    }
}
