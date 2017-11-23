package com.metr.api.models;

import java.time.LocalDate;
import java.util.List;

public class Location {

    private Long locationId;
    private String title;
    private String description;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private List<String> images;
    private Customer owner;
    private List<Rating> ratings;
    private LocalDate lastBooked;
    private Double latitude;
    private Double longitude;

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public LocalDate getLastBooked() {
        return lastBooked;
    }

    public void setLastBooked(LocalDate lastBooked) {
        this.lastBooked = lastBooked;
    }

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

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", images=" + images +
                ", owner=" + owner +
                ", ratings=" + ratings +
                ", lastBooked=" + lastBooked +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
